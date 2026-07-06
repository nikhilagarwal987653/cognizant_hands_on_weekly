package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
        System.out.println("Setup completed before each test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleanup completed after each test");
    }

    @Test
    void testAdd() {
        int a = 10;
        int b = 30;

        int res = c.add(a, b);

        assertEquals(40, res);
    }

    @Test
    void testDivide() {
        int a = 10;
        int b = 5;

        int res = c.divide(a, b);

        assertEquals(2, res);
    }

    @Test
    void testMultiply() {
        int a = 10;
        int b = 5;

        int res = c.multiply(a, b);

        assertEquals(50, res);
    }
}