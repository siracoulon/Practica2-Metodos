package ej6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TryCatchFinallyTest {

    @Test
    void testArchivoNoExiste() {
        // Guardar la salida original de la consola
        PrintStream originalOut = System.out;

        // Capturar la salida de consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main
        TryCatchFinally.main(new String[]{});

        // Restaurar la salida estándar
        System.setOut(originalOut);

        // Convertir la salida a texto
        String output = outContent.toString();

        // Verificar que aparecen los mensajes correctos
        assertTrue(output.contains("File Not Found caught"));
        assertTrue(output.contains("finally-block runs regardless"));
        assertTrue(output.contains("After try-catch-finally, life goes on"));
    }
}
