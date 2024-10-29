package com.example.farmacia.controller;

import com.example.farmacia.model.Cliente;
import com.example.farmacia.service.ClienteService;
//GOOGLE GUAVA
import com.google.common.collect.ImmutableList; // Importar ImmutableList
//APACHE POI
import org.apache.commons.lang3.StringUtils; // Importar StringUtils
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public String getAllClientes(Model model) {
        List<Cliente> clientes = clienteService.findAll();
        model.addAttribute("clientes", ImmutableList.copyOf(clientes)); // Usar ImmutableList
        return "clientes-intranet"; // Asegúrate de que este nombre coincida con el nombre del archivo HTML
    }

    @PostMapping("/guardar")
    public String createCliente(@ModelAttribute Cliente cliente, Model model) {
        // Validar que los campos requeridos no estén vacíos
        if (StringUtils.isBlank(cliente.getNombre()) || StringUtils.isBlank(cliente.getApellido())) {
            model.addAttribute("error", "El nombre y el apellido son obligatorios.");
            return "clientes-intranet"; // Redirige a la vista con un mensaje de error
        }

        clienteService.save(cliente);
        return "redirect:/clientes"; // Redirige a la lista de clientes
    }

    @PostMapping("/actualizar")
    public String updateCliente(@ModelAttribute Cliente cliente, Model model) {
        // Validar que los campos requeridos no estén vacíos
        if (StringUtils.isBlank(cliente.getNombre()) || StringUtils.isBlank(cliente.getApellido())) {
            model.addAttribute("error", "El nombre y el apellido son obligatorios.");
            return "clientes-intranet"; // Redirige a la vista con un mensaje de error
        }

        clienteService.save(cliente);
        return "redirect:/clientes"; // Redirige a la lista de clientes
    }

    @GetMapping("/eliminar/{id}")
    public String deleteCliente(@PathVariable Long id) {
        clienteService.deleteById(id);
        return "redirect:/clientes"; // Redirige a la lista de clientes
    }
}