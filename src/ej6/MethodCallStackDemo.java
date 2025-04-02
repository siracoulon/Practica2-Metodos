package ej6;
public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            System.out.println(1 / 0);
// A divide-by-0 triggers an ArithmeticException - an unchecke exception
// This method does not catch ArithmeticException
// It runs the "finally" and popped off the call stack
        }catch (ArithmeticException e) {
            System.out.println("Exception caught in methodA: " + e.getMessage());
        } finally {
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()");
    }
}