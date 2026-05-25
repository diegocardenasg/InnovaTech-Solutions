package com.innova.tech_solution.model;

import jakarta.persistence.*;
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
    private Integer id;

    private Integer rut;
    private String nombre;
    private String email;

    @Column (name = "id_rol")
    private Integer idRol;

    @Column (name = "fecha_nac")
    private LocalTime fechaNac;

    @Column (name = "fecha_ingr")
    private LocalTime fechaIngr;
}
