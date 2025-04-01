package ej3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionHandlingExampleTest {

    @Test
    void testMethodDThrowsException() {
        try {
            ExceptionHandlingExample.methodD();
            fail("Se esperaba una XxxException, pero no se lanzó ninguna.");
        } catch (XxxException e) {
            // La excepción fue atrapada correctamente, lo que significa que el test pasa.
        }
    }

    @Test
    void testMethodCThrowsException() {
        try {
            ExceptionHandlingExample.methodC();
            fail("Se esperaba una XxxException, pero no se lanzó ninguna.");
        } catch (XxxException e) {
            // La excepción fue atrapada correctamente.
        }
    }

    @Test
    void testMethodBThrowsException() {
        try {
            ExceptionHandlingExample.methodB();
            fail("Se esperaba una XxxException, pero no se lanzó ninguna.");
        } catch (XxxException e) {
            // La excepción fue atrapada correctamente.
        }
    }

    @Test
    void testMethodAHandlesException() {
        try {
            ExceptionHandlingExample.methodA();  // No debería lanzar ninguna excepción
        } catch (Exception e) {
            fail("methodA() no debería propagar la excepción, pero lo hizo.");
        }
    }

}