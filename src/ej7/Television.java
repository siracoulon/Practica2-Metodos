package ej7;
// IllegalStateExample

public class Television {
    public boolean isOn = false;

    public void turnOn() {
        if (isOn) {
            throw new IllegalStateException("La televisión ya está encendida.");
        }
        isOn = true;
        System.out.println("La televisión se ha encendido.");
    }

    public void turnOff() {
        if (!isOn) {
            throw new IllegalStateException("La televisión ya está apagada.");
        }
        isOn = false;
        System.out.println("La televisión se ha apagado.");
    }

    public void changeChannel(int channel) {
        if (!isOn) {
            throw new IllegalStateException("No se puede cambiar el canal porque la televisión está apagada.");
        }
        System.out.println("Cambiando al canal " + channel);
    }

    public static void main(String[] args) {
        Television tv = new Television();

        try {
            tv.changeChannel(5);  // Esto generará una IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }

        try {
            tv.turnOn();
            tv.turnOn();  // Esto generará una IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }

        try {
            tv.changeChannel(5);  // Esto debería funcionar correctamente
            tv.turnOff();
            tv.turnOff();  // Esto generará una IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }

    public boolean isOn() {
        return isOn;
    }
}