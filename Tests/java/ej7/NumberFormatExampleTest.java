package ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

class NumberFormatExampleTest {

    @Test
    void testGenerateNumberFormatException() {
        try {
            NumberFormatExample.generateNumberFormatException();  // Ejecutamos el método que debería fallar
            fail("Se esperaba una NumberFormatException, pero no se lanzó ninguna.");
        } catch (NumberFormatException e) {
            // La excepción fue atrapada correctamente, el test pasa
        }
    }
}