package com.innova.tech_solution.controller;

import com.innova.tech_solution.model.EmpleadoTech;
import com.innova.tech_solution.service.EmpleadoTechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/empleados")
public class EmpleadoTechController {
    @Autowired
    private EmpleadoTechService service;

    @GetMapping
    public ResponseEntity<List<EmpleadoTech>> listar() {
        List<EmpleadoTech> empleados = service.getEmpleados();

        if (empleados.isEmpty())
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.ok(empleados);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoTech>
    buscarPorId(@PathVariable Integer id) {
        Optional<EmpleadoTech> empleado = service.getEmpleado(id);

        if (empleado.isPresent())
            return ResponseEntity.ok(empleado.get());   // 201 - OK
        else
            return ResponseEntity.notFound().build();   // 404 - Not Found

        /*  OTRA FORMA MAS SIMPLIFICADA
        return service.getRuta(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());

        */
    }

    @PostMapping
    public ResponseEntity<EmpleadoTech>
    agregaEmpleado(@RequestBody EmpleadoTech empleado) {

        EmpleadoTech empleadoNuevo = service.saveEmpleado(empleado);

        return ResponseEntity
                .status(HttpStatus.CREATED) // 201 - Created
                .body(empleadoNuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpleadoTech> editar(
            @PathVariable Integer id,
            @RequestBody EmpleadoTech empleado
    ){
        Optional<EmpleadoTech> existe = service.getEmpleado(id);

        if(existe.isEmpty()){
            return ResponseEntity.notFound().build();   // 404
        }

        empleado.setId(id);

        EmpleadoTech actualizada = service.saveEmpleado(empleado);
        return ResponseEntity.ok(actualizada);  // 201
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>
    eliminar(@PathVariable Integer id){
        try {
            service.delete(id);
            return ResponseEntity.noContent().build(); // 204
        } catch (Exception e) {
            return ResponseEntity.notFound().build(); // 404
        }

    }
}
