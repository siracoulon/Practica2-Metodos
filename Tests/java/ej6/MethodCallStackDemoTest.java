package ej6;import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MethodCallStackDemoTest {

    @Test
    void testDividirPorCero() {
        // Guardar la salida original de la consola
        PrintStream originalOut = System.out;

        // Capturar la salida de consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el main
        MethodCallStackDemo.main(new String[]{});

        // Restaurar la salida estándar
        System.setOut(originalOut);

        // Convertir la salida a texto
        String output = outContent.toString();

        // Verificar que aparecen los mensajes correctos
        assertTrue(output.contains("Enter main()"));
        assertTrue(output.contains("Enter methodA()"));
        assertTrue(output.contains("finally in methodA()"));
        assertTrue(output.contains("Exit main()"));

        // Verificar que la excepción no interrumpe la ejecución
        assertTrue(output.contains("ArithmeticException"));
    }
}
