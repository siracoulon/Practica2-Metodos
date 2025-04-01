package ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class IllegalArgumentExampleTest {

    @Test
    void testCheckKidsWithNegativeHijos() {
        // Creamos una variable para almacenar el mensaje de la excepción
        String exceptionMessage = "";

        try {
            // Intentamos ejecutar el método con un valor negativo
            IllegalArgumentExample.checkKids(-5);
        } catch (IllegalArgumentException e) {
            // Si se lanza una excepción, capturamos el mensaje de la excepción
            exceptionMessage = e.getMessage();
        }

        // Comprobamos que el mensaje de la excepción sea el esperado
        assertEquals("No se puede tener un número de hijos negativo.", exceptionMessage);
    }

    @Test
    void testCheckKidsWithValidHijos() {
        // No esperamos que se lance ninguna excepción, por lo que simplemente verificamos que no ocurra nada
        try {
            IllegalArgumentExample.checkKids(2);
        } catch (IllegalArgumentException e) {
            fail("No se esperaba una excepción, pero ocurrió: " + e.getMessage());
        }
    }
}