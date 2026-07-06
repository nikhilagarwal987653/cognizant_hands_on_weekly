package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {

    @Test
    void testAssertions() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2, 3));

        assertTrue(5 > 3);

        assertFalse(5 < 3);

        String name = null;
        assertNull(name);

        assertNotNull(calculator);

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}