package ej3;

public class ExceptionHandlingExample {

    public static void methodD() throws XxxException {
        throw new XxxException("Excepción lanzada en methodD");
    }

    public static void methodC() throws XxxException {
        methodD();
    }

    public static void methodB() throws XxxException {
        methodC();
    }

    public static void methodA() {
        try {
            methodB();
        } catch (XxxException e) {
            System.out.println("Excepción atrapada en methodA: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}
