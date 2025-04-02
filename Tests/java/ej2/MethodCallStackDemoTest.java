package ej2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodCallStackDemoTest {

    @Test
    void testMethodCThrowsArithmeticException() {
        // Este test verifica que el método methodC lanza la excepción ArithmeticException
        assertThrows(ArithmeticException.class, () -> MethodCallStackDemo.methodC());
    }
}