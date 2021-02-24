package co.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestStringCalculator {
    StringCalculator calc = new StringCalculator();

    @Test
    void testZeroOrOneDigits() {
        try {
            assertEquals(6, calc.Add("6"));
            assertEquals(0, calc.Add(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testMoreThanOneNumbers() {
        try {
            assertEquals(7, calc.Add("1,1,2,3"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testHandleNewline() {
        try {
            assertEquals(6, calc.Add("1\n2,3"));
            assertEquals(10, calc.Add("1,2\n3,4"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testHandleDifferentDelimiters() {
        try {
            assertEquals(3, calc.Add("//;\n1;2"));
            assertEquals(6, calc.Add("//:\n1:2:3"));
            assertEquals(10, calc.Add("//'\n1'2'3'4"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testNegativeNumbers() {
        try {
            assertEquals(-3, calc.Add("-1,-2"));
            assertEquals(-4, calc.Add("1,-2,-3"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
