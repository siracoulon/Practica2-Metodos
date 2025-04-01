package ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArrayExceptionExampleTest {

    @Test
    void testGenerateExceptionThrowsArrayIndexOutOfBoundsException() {
        try {
            ArrayExceptionExample.generateException();  // Ejecutamos el método que debería fallar
            fail("Se esperaba una ArrayIndexOutOfBoundsException, pero no se lanzó ninguna.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // La excepción fue atrapada correctamente, el test pasa
        }
    }
}