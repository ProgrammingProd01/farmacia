package com.example.farmacia.service;

import com.example.farmacia.model.Empleado;
import com.example.farmacia.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Empleado findById(Integer id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public void deleteById(Integer id) {
        empleadoRepository.deleteById(id);
    }
}