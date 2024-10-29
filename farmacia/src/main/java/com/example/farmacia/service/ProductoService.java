package com.example.farmacia.service;

import com.example.farmacia.model.Producto;
import com.example.farmacia.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Crear un nuevo producto
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Obtener todos los productos
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    // Obtener un producto por ID
    public Optional<Producto> obtenerProductoPorId(Integer id) {
        return productoRepository.findById(id);
    }

    // Actualizar un producto
    public Producto actualizarProducto(Integer id, Producto productoDetalles) {
        Producto producto = productoRepository.findById(id).orElseThrow();
        producto.setNombre(productoDetalles.getNombre());
        producto.setDescripcion(productoDetalles.getDescripcion());
        producto.setPrecio(productoDetalles.getPrecio());
        producto.setStock(productoDetalles.getStock());
        return productoRepository.save(producto);
    }

    // Eliminar un producto
    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}