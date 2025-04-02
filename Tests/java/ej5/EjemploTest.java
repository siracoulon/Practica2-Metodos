package ej5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EjemploTest {

    @Test
    void testMethodDXxxException() {
        Ejemplo ejemplo = new Ejemplo();


        assertDoesNotThrow(() -> {
            try {
                ejemplo.methodD();
            } catch (Exception e) {
                fail("El método lanzó una excepción inesperada: " + e.getMessage());
            }
        });
    }

    @Test
    void testMethodDYyyException() {
        Ejemplo ejemplo = new Ejemplo();


        assertDoesNotThrow(() -> {
            try {
                ejemplo.methodD();
            } catch (Exception e) {
                fail("El método lanzó una excepción inesperada: " + e.getMessage());
            }
        });
    }
}
