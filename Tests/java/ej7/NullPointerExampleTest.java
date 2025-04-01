package ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

class NullPointerExampleTest {

    @Test
    void testGenerateNullPointerException() {
        try {
            NullPointerExample.generateNullPointerException();  // Ejecutamos el método que debería fallar
            fail("Se esperaba una NullPointerException, pero no se lanzó ninguna.");
        } catch (NullPointerException e) {
            // La excepción fue atrapada correctamente, el test pasa
        }
    }
}