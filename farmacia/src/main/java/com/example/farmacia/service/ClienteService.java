package com.example.farmacia.service;

import com.example.farmacia.model.Cliente;
import com.example.farmacia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) { // Cambiado a Long
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteById(Long id) { // Cambiado a Long
        clienteRepository.deleteById(id);
    }
}