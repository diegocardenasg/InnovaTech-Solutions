package com.innova.tech_solution.service;

import com.innova.tech_solution.model.EmpleadoTech;
import com.innova.tech_solution.repository.EmpleadoTechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoTechService {
    @Autowired
    private EmpleadoTechRepository repository;

    public List<EmpleadoTech> getEmpleados() {return repository.findAll(); }

    public Optional<EmpleadoTech> getEmpleado(Integer id){
        return repository.findById(id);
    }

    public EmpleadoTech saveEmpleado(EmpleadoTech empleado){
        return repository.save(empleado);
    }

    public EmpleadoTech updateEmpleado(Integer id, EmpleadoTech empleado){
        Optional existe = getEmpleado(id);

        if(existe.isEmpty())
            throw new RuntimeException("NO encontrado");
        else
            return repository.save(empleado);
    }

    public void delete(Integer id){
        if(repository.existsById(id))
            repository.deleteById(id);
        else
            throw new RuntimeException("No encontrado");
    }
}
