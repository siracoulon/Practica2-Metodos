package ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClassCastExampleTest {

    @Test
    void testGenerateClassCastException() {
        try {
            ClassCastExample.generateClassCastException();  // Ejecutamos el método que debería fallar
            fail("Se esperaba una ClassCastException, pero no se lanzó ninguna.");
        } catch (ClassCastException e) {
            // La excepción fue atrapada correctamente, el test pasa
        }
    }
}