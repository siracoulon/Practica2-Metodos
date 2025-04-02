package ej8;


public class AgeValidatorTest {


    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Edad inválida: " + age + ". Debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(150);
        } catch (InvalidAgeException ex) {
            ex.printStackTrace();
        }
    }
}
