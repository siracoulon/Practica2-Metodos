package ej4;

public class EjemploExcepciones {
    public static void main(String[] args) {
        //ArithmeticException
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }

        //NullPointerException
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Intento de acceder a un objeto nulo.");
        }

        //ArrayIndexOutOfBoundsException
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango en el array.");
        }

        //IllegalArgumentException
        try {
            establecerEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            validarArchivo("archivo_inexistente.txt");
        } catch (MiExcepcionVerificada e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }


    public static int dividir(int a, int b) {
        return a / b;
    }


    public static void establecerEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        System.out.println("Edad establecida: " + edad);
    }


    public static void validarArchivo(String nombreArchivo) throws MiExcepcionVerificada {

        throw new MiExcepcionVerificada("El archivo " + nombreArchivo + " no fue encontrado.");
    }
}


class MiExcepcionVerificada extends Exception {
    public MiExcepcionVerificada(String mensaje) {
        super(mensaje);
    }
}
