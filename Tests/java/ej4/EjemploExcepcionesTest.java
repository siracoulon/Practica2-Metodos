package ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjemploExcepcionesTest {

    @Test
    void main() {
    }

    @Test
    void dividir() {
        assertEquals(2, EjemploExcepciones.dividir(10, 5));
        assertThrows(ArithmeticException.class, () -> EjemploExcepciones.dividir(10, 0));
    }

    @Test
    void establecerEdad() {
        EjemploExcepciones.establecerEdad(25);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> EjemploExcepciones.establecerEdad(-5));
        assertEquals("La edad no puede ser negativa.", exception.getMessage());
    }

    @Test
    void validarArchivo() {
        MiExcepcionVerificada exception = assertThrows(MiExcepcionVerificada.class, () -> EjemploExcepciones.validarArchivo("archivo_inexistente.txt"));
        assertEquals("El archivo archivo_inexistente.txt no fue encontrado.", exception.getMessage());
    }
}
