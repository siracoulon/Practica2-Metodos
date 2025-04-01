package ej7;

public class ArrayExceptionExample {
    public static void generateException() {
        int[] numbers = new int[3];  // Array con 3 posiciones: [0, 1, 2]
        System.out.println(numbers[3]);  // Intenta acceder a la posición 3 (fuera del rango)
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}
