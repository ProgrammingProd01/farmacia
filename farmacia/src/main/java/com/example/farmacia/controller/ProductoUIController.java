package com.example.farmacia.controller;

import com.example.farmacia.model.Producto;
import com.example.farmacia.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductoUIController {

    @Autowired
    private ProductoService productoService;

    // Mostrar la vista de productos en la intranet
    @GetMapping("/productos-intranet")
    public String mostrarProductosIntranet(Model model) {
        List<Producto> productos = productoService.obtenerTodosLosProductos();
        model.addAttribute("productos", productos);
        return "productos-intranet"; // Nombre de la vista Thymeleaf para la intranet
    }

    // Mostrar la vista de productos
    @GetMapping("/productos")
    public String mostrarProductos(Model model) {
        List<Producto> productos = productoService.obtenerTodosLosProductos();
        model.addAttribute("productos", productos);
        return "productos"; // Nombre de la vista Thymeleaf (productos.html)
    }

    // Agregar un nuevo producto desde el formulario en la UI
    @PostMapping("/productos-intranet/agregar")
    public String agregarProducto(Producto producto) {
        // Validar que el producto no sea nulo y tenga los campos requeridos
        if (producto == null || producto.getNombre() == null || producto.getPrecio() == null || producto.getStock() == null) {
            // Manejar error (por ejemplo, redirigir a una página de error o mostrar un mensaje)
            return "redirect:/productos-intranet?error=productoInvalido";
        }
        productoService.crearProducto(producto);
        return "redirect:/productos-intranet"; // Redirigir a la lista de productos después de agregar
    }

    // Actualizar un producto
    @PostMapping("/productos-intranet/actualizar")
    public String actualizarProducto(Producto producto) {
        // Validar que el ID del producto no sea nulo
        if (producto.getId_producto() == null) {
            // Manejar error (por ejemplo, redirigir a una página de error o mostrar un mensaje)
            return "redirect:/productos-intranet?error=idInvalido";
        }
        productoService.actualizarProducto(producto.getId_producto(), producto);
        return "redirect:/productos-intranet"; // Redirigir después de actualizar
    }

    // Eliminar un producto
    @GetMapping("/productos-intranet/eliminar/{id}")
    public String eliminarProducto(@PathVariable Integer id) {
        if (id == null) {
            // Manejar error (por ejemplo, redirigir a una página de error o mostrar un mensaje)
            return "redirect:/productos-intranet?error=idInvalido";
        }
        productoService.eliminarProducto(id);
        return "redirect:/productos-intranet"; // Redirigir a la lista de productos después de eliminar
    }
}