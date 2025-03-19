package ej2;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");//1
        methodA(); //Ejecuto el método A que
        System.out.println("Exit main()");//8
    }
    public static void methodA() {
        System.out.println("Enter methodA()");//2
        methodB(); // LLama al método B que
        System.out.println("Exit methodA()");//7
    }
    public static void methodB() {
        System.out.println("Enter methodB()");//3
        methodC(); // Llama al método C que
        System.out.println("Exit methodB()");//6
    }
    public static void methodC() throws ArithmeticException{
        System.out.println("Enter methodC()");//4
        System.out.println(1 / 0); // divide-by-0 triggers an ArithmeticException //4.5
        System.out.println("Exit methodC()");//5
        //Ejecuta esto
    }
}
