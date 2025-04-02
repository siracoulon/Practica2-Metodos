package ej6;

import java.util.Scanner;

public class ExceptionDemo {

    public int dividir(int numerador, int denominador) {
        try {
            // Intentar dividir
            int resultado = numerador / denominador;
            System.out.println("División realizada con éxito");
            return resultado;

        } catch (ArithmeticException ex) {
            // Manejar división por cero
            System.out.println("¡Error! No se puede dividir por cero");
            return 0;  // Retornamos 0 en caso de error, se puede ajustar según necesidad
        } finally {
            // Siempre se ejecuta
            System.out.println("Operación de división finalizada");
        }
    }

    public int convertirANumero(String texto) {
        try {
            // Intentar convertir el texto a número
            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa: " + texto + " -> " + numero);
            return numero;

        } catch (NumberFormatException ex) {
            // Manejar error en la conversión
            System.out.println("¡Error! '" + texto + "' no es un número válido");
            return 0;  // Retornar 0 si no es un número válido
        } finally {
            // Siempre se ejecuta
            System.out.println("Operación de conversión finalizada");
        }
    }

    public void demostrarMultiplesExcepciones() {
        try {
            // Intentar acceder a una posición fuera de límites
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]);  // Error de índice fuera de rango
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error de índice: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Otra excepción: " + ex.toString());
        } finally {
            System.out.println("Bloque finally ejecutado");
        }
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        Scanner scanner = new Scanner(System.in);

        // Prueba de división
        System.out.println("Resultado: " + demo.dividir(10, 0));

        // Prueba de conversión
        System.out.println("Número: " + demo.convertirANumero("abc"));

        // Demostración de múltiples excepciones
        System.out.println("\nDemostración de múltiples excepciones:");
        demo.demostrarMultiplesExcepciones();

        scanner.close();
    }
}
