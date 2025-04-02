package ej1;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
// Tratamiento de excepciones, I0Excepcion y FilenotfoundExcepcion
public class Test {
    public static void main(String[] args) {
        File file = new File("test.in");
        FileWriter writer = null;
        BufferedReader reader = null;

        try {
            // Crear el archivo y escribir datos en él
            writer = new FileWriter(file);
            writer.write("Probando 1 2 1 2");
            System.out.println("Esto es lo que he escrito");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: ");
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }

        try {
            // para leer el archivo
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Leyendo: " + line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida: " + ex.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo: " + ex.getMessage());
            }
        }
    }
}
