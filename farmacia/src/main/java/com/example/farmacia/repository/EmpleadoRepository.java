package com.example.farmacia.repository;

import com.example.farmacia.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}