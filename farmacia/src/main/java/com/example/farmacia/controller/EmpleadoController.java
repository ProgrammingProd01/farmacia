package com.example.farmacia.controller;

import com.example.farmacia.model.Empleado;
import com.example.farmacia.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public String listarEmpleados(Model model) {
        List<Empleado> empleados = empleadoService.findAll();
        model.addAttribute("empleados", empleados);
        return "empleado-intranet"; // Nombre de la plantilla Thymeleaf
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/empleados"; // Redirigir a la lista después de guardar
    }

    @PostMapping("/actualizar")
    public String actualizarEmpleado(@ModelAttribute Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/empleados"; // Redirigir a la lista después de actualizar
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable Integer id) {
        empleadoService.deleteById(id);
        return "redirect:/empleados"; // Redirigir a la lista después de eliminar
    }
}