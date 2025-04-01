package ej7;

public class IllegalArgumentExample {

    public static void checkKids(int hijos) {
        if (hijos < 0) {
            throw new IllegalArgumentException("No se puede tener un número de hijos negativo.");
        }
        System.out.println("Hijos validos: " + hijos);
    }

    public static void main(String[] args) {
        try {
            checkKids(-5);  // Esto generará una IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}