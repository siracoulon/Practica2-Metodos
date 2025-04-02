package ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class ExceptionDemoTest {

    private ExceptionDemo demo;
    private final ByteArrayOutputStream outputCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        // Crear una nueva instancia de la clase para cada prueba
        demo = new ExceptionDemo();

        // Capturar la salida estándar (System.out) para verificarla
        System.setOut(new PrintStream(outputCaptor));
    }

    @AfterEach
    public void tearDown() {
        // Restaurar la salida estándar
        System.setOut(originalOut);
    }

    @Test
    public void testDividirExitoso() {
        // Prueba de división exitosa
        int resultado = demo.dividir(10, 2);
        assertEquals(5, resultado);

        // Verificar que se imprimieron los mensajes esperados
        String output = outputCaptor.toString();
        assertTrue(output.contains("División realizada con éxito"));
        assertTrue(output.contains("Operación de división finalizada"));
    }

    @Test
    public void testDividirPorCero() {
        // Probar la división por cero
        int resultado = demo.dividir(10, 0);
        assertEquals(0, resultado); // Esperamos que retorne 0 en caso de error

        // Verificar que se imprimieron los mensajes esperados
        String output = outputCaptor.toString();
        assertTrue(output.contains("¡Error! No se puede dividir por cero"));
        assertTrue(output.contains("Operación de división finalizada"));
    }

    @Test
    public void testConvertirExitoso() {
        // Probar la conversión exitosa de un número
        int resultado = demo.convertirANumero("123");
        assertEquals(123, resultado);

        // Verificar que se imprimieron los mensajes esperados
        String output = outputCaptor.toString();
        assertTrue(output.contains("Conversión exitosa"));
        assertTrue(output.contains("Operación de conversión finalizada"));
    }

    @Test
    public void testConvertirInvalido() {
        // Probar la conversión de un texto no numérico
        int resultado = demo.convertirANumero("abc");
        assertEquals(0, resultado); // Esperamos que retorne 0 en caso de error

        // Verificar que se imprimieron los mensajes esperados
        String output = outputCaptor.toString();
        assertTrue(output.contains("¡Error!"));
        assertTrue(output.contains("Operación de conversión finalizada"));
    }

    @Test
    public void testMultiplesExcepciones() {
        // Probar el manejo de múltiples excepciones
        demo.demostrarMultiplesExcepciones();

        // Verificar que se imprimió la excepción correcta
        String output = outputCaptor.toString();
        assertTrue(output.contains("Error de índice"));
        assertTrue(output.contains("Bloque finally ejecutado"));
    }
}
