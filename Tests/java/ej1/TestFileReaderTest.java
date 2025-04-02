package ej1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class TestFileReaderTest {
    private File testFile;

    @BeforeEach
    void setUp() throws IOException {
        testFile = new File("test.in");
        FileWriter writer = new FileWriter(testFile);
        writer.write("Probando 1 2 1 2");
        writer.close();
    }

    @Test
    void testFileWritingAndReading() {
        try (BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            assertEquals("Probando 1 2 1 2", reader.readLine());
            assertNull(reader.readLine());
        } catch (IOException e) {
            fail("Error al leer el archivo: " + e.getMessage());
        }
    }


    @Test
    void testFileNotFound() {
        File nonExistentFile = new File("nonexistent.in");
        assertThrows(FileNotFoundException.class, () -> new BufferedReader(new FileReader(nonExistentFile)));
    }

    @AfterEach
    void tearDown() {
        if (testFile.exists()) {
            assertTrue(testFile.delete(), "No se pudo eliminar el archivo de prueba");
        }
    }
}
