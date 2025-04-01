package ej7;

// NoClassDefFoundError

public class MainProgram {
    public static void main(String[] args) {
        try {
            Class.forName("MyClass");  // Try to load a class that is not available
        } catch (ClassNotFoundException e) {
            System.out.println("he generado una excepcion de tipo ClassNotFoundException");
            e.printStackTrace();  // This will print the ClassNotFoundException instead of NoClassDefFoundError
        }
    }
}