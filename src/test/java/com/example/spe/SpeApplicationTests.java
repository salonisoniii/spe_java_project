package com.example.spe;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SpeApplicationTests {
    @Test
    public void testAddition() {
        double result = SpeApplication.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        double result = SpeApplication.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        double result = SpeApplication.multiply(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testDivision() {
        double result = SpeApplication.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testDivisionByZero() {
        double result = SpeApplication.divide(6, 0);
        assertEquals(Double.NaN, result);
    }

    @Test
    public void testInvalidOperator() {
        double result = SpeApplication.calculate(6, 3, '&');
        assertEquals(Double.NaN, result);
    }

}
