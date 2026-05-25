package com.innova.tech_solution.repository;

import com.innova.tech_solution.model.EmpleadoTech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoTechRepository
    extends JpaRepository<EmpleadoTech, Integer> {
}
