package ej8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgeValidatorTestTest {


    @Test
    void validateAgeValid() {
        try {
            AgeValidatorTest.validateAge(25);  // La edad es válida (entre 0 y 120), no debe lanzar excepción.
        } catch (InvalidAgeException ex) {
            fail("No se esperaba una excepción: " + ex.getMessage());
        }
    }


    @Test
    void validateAgeInvalid() {
        InvalidAgeException exception = assertThrows(InvalidAgeException.class, () -> {
            AgeValidatorTest.validateAge(150);
        });
        assertEquals("Edad inválida: 150. Debe estar entre 0 y 120.", exception.getMessage());
    }


    @Test
    void main() {
        try {
            AgeValidatorTest.main(new String[]{});
        } catch (Exception ex) {
            fail("El método main() arrojó una excepción: " + ex.getMessage());
        }
    }
}
