
package com.example.farmacia.model;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

 //   @Test
    public void testGettersAndSetters() {
        Empleado empleado = new Empleado();

        // Establecer valores
        empleado.setId_empleado(1);
        empleado.setNombre("Juan");
        empleado.setApellido("Pérez");
        empleado.setCargo("Farmacéutico");
        empleado.setTelefono("123456789");

        // Verificar los valores establecidos
        //assertEquals(1, empleado.getId_empleado());
        //assertEquals("Juan", empleado.getNombre());
        //assertEquals("Pérez", empleado.getApellido());
       // assertEquals("Farmacéutico", empleado.getCargo());
        //assertEquals("123456789", empleado.getTelefono());
    }

   // @Test
    public void testEmpleadoConstructor() {
        Empleado empleado = new Empleado();

        // Probar que los valores por defecto son nulos
        //assertNull(empleado.getNombre());
        //assertNull(empleado.getApellido());
        //assertNull(empleado.getCargo());
        //assertNull(empleado.getTelefono());
    }
}