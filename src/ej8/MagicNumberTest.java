package ej8;

public class MagicNumberTest {


    public static void checkMagicNumber(int number) throws MagicNumberException {
        if (number == 8) {
            throw new MagicNumberException("¡Has encontrado el número mágico!");
        }
        System.out.println("El número es seguro: " + number);
    }

    public static void main(String[] args) {
        try {
            checkMagicNumber(9);
            checkMagicNumber(8);
        } catch (MagicNumberException ex) {
            ex.printStackTrace();
        }
    }
}

