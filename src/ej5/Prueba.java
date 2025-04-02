package ej5;
public class Prueba {
    public static void main(String[] args) {
        Ejemplo example = new Ejemplo();
        try {
            example.methodD();
        } catch (Ejemplo.XxxException | Ejemplo.YyyException e) {
            System.out.println("Manejado " + e.getMessage());
        }
    }
}