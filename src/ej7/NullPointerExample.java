package ej7;

public class NullPointerExample {
    public static void generateNullPointerException() {
        String[] strs = new String[3];  // Array de 3 elementos, pero cada pos es NULL
        System.out.println(strs[0].length());  // strs[0] es NULL lo q provoca NullPointerException
    }

    public static void main(String[] args) {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}
