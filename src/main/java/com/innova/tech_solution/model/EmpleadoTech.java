package com.innova.tech_solution.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "empleado_tech")
public class EmpleadoTech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_empleado")
    private Integer id;

    @NotBlank(message = "rut obligatorio")
    @Size(max = 8, message = "El rut no puede superar los 8 digitos")
    private Integer rut;

    @NotBlank(message = "rut digito verificador obligatorio")
    @Size(max = 1, message = "El ultimo digito no puede ser superado a mas de 1 digito")
    @Column (name = "rut_dv")
    private String rutdv;

    private String nombre;

    private String email;

    @Column (name = "id_rol")
    private Integer idRol;

    @Column (name = "fecha_nac")
    private LocalTime fechaNac;

    @Column (name = "fecha_ingr")
    private LocalTime fechaIngr;
}
