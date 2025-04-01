package ej7;

// NoClassDefFoundErrorTest

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainProgramTest {

    @Test
    void testClassNotFoundException() {
        String errorMessage = "";
        try {
            Class.forName("MyClass"); // Intenta cargar una clase inexistente
        } catch (ClassNotFoundException e) {
            errorMessage = "he generado una excepcion de tipo ClassNotFoundException";
        }

        assertEquals("he generado una excepcion de tipo ClassNotFoundException", errorMessage);
    }
}