package ej8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MagicNumberTestTest {


    @Test
    void checkMagicNumberTest() {
        try {
            MagicNumberTest.checkMagicNumber(9);
        } catch (MagicNumberException ex) {
            fail("No se esperaba una excepción: " + ex.getMessage());
        }
    }


    @Test
    void checkMagicNumberThrowsException() {
        MagicNumberException exception = assertThrows(MagicNumberException.class, () -> {
            MagicNumberTest.checkMagicNumber(8);
        });
        assertEquals("¡Has encontrado el número mágico!", exception.getMessage());
    }


    @Test
    void main() {
        try {
            MagicNumberTest.main(new String[]{});
        } catch (Exception ex) {
            fail("El método main() arrojó una excepción: " + ex.getMessage());
        }
    }
}
