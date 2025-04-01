package ej7;

public class ClassCastExample {
    public static void generateClassCastException() {
        Object o = new Object();  // Creamos un objeto genérico
        Integer i = (Integer) o;  // Intentamos convertirlo a Integer, lo que causará ClassCastException
    }

    public static void main(String[] args) {
        try {
            generateClassCastException();
        } catch (ClassCastException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}