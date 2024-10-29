package com.example.farmacia.controller;

import com.example.farmacia.model.Producto;
import com.example.farmacia.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Crear un nuevo producto
    @PostMapping
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.crearProducto(producto));
    }

    // Obtener todos los productos
    @GetMapping
    public ResponseEntity<List<Producto>> obtenerTodosLosProductos() {
        return ResponseEntity.ok(productoService.obtenerTodosLosProductos());
    }

    // Obtener un producto por ID
    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProductoPorId(@PathVariable Integer id) {
        return ResponseEntity.of(productoService.obtenerProductoPorId(id));
    }

    // Actualizar un producto
    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Integer id, @RequestBody Producto productoDetalles) {
        return ResponseEntity.ok(productoService.actualizarProducto(id, productoDetalles));
    }

    // Eliminar un producto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Integer id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
}