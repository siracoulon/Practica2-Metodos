package ej7;

public class NumberFormatExample {
    public static void generateNumberFormatException() {
        String invalidNumber = "abc";  // Cadena que no puede ser convertida a número
        Integer.parseInt(invalidNumber);  // Esto generará una NumberFormatException
    }

    public static void main(String[] args) {
        try {
            generateNumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}