package com.example.farmacia.model;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    //@Test
    public void testGettersAndSetters() {
        // Arrange
        Cliente cliente = new Cliente();
        cliente.setId_cliente(1);
        cliente.setNombre("Juan");
        cliente.setApellido("Pérez");
        cliente.setTelefono("123456789");
        cliente.setDireccion("Calle Falsa 123");

        //Act & Assert
        //assertEquals(1, cliente.getId_cliente());
        //assertEquals("Juan", cliente.getNombre());
        //assertEquals("Pérez", cliente.getApellido());
        //assertEquals("123456789", cliente.getTelefono());
        //assertEquals("Calle Falsa 123", cliente.getDireccion());
    }
}