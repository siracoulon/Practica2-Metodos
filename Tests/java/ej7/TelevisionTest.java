package ej7;

// IllegalStateExampleTest

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void testTurnOn() {
        Television tv = new Television();
        tv.turnOn();
        assertTrue(tv.isOn(), "La televisión debería estar encendida.");
    }

    @Test
    public void testTurnOff() {
        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        assertFalse(tv.isOn(), "La televisión debería estar apagada.");
    }

    @Test
    public void testChangeChannelWhenOn() {
        Television tv = new Television();
        tv.turnOn();
        tv.changeChannel(5);
        // No hay excepción, así que el test pasa
    }

    @Test
    public void testChangeChannelWhenOff() {
        Television tv = new Television();
        try {
            tv.changeChannel(5);
            fail("Se esperaba una IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("No se puede cambiar el canal porque la televisión está apagada.", e.getMessage());
        }
    }

    @Test
    public void testTurnOnTwice() {
        Television tv = new Television();
        tv.turnOn();
        try {
            tv.turnOn();
            fail("Se esperaba una IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("La televisión ya está encendida.", e.getMessage());
        }
    }

    @Test
    public void testTurnOffTwice() {
        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        try {
            tv.turnOff();
            fail("Se esperaba una IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("La televisión ya está apagada.", e.getMessage());
        }
    }

    @Test
    public void testInitialState() {
        Television tv = new Television();
        assertFalse(tv.isOn(), "La televisión debería estar apagada inicialmente.");
    }

    @Test
    public void testTurnOnAndChangeChannel() {
        Television tv = new Television();
        tv.turnOn();
        tv.changeChannel(10);
        assertTrue(tv.isOn(), "La televisión debería estar encendida.");
    }

    @Test
    public void testTurnOnTurnOffAndChangeChannel() {
        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        try {
            tv.changeChannel(10);
            fail("Se esperaba una IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("No se puede cambiar el canal porque la televisión está apagada.", e.getMessage());
        }
    }
}
