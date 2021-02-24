package co.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestStringCalculator {
    StringCalculator calc = new StringCalculator();

    @Test
    void testZeroOrOneDigits() {
        // Only 1 number
        assertEquals(6, calc.Add("6"));
        // No numbers
        assertEquals(0, calc.Add(""));
    }

    @Test
    void testMoreThanOneNumbers() {
        assertEquals(7, calc.Add("1,1,2,3"));
    }

    @Test
    void testHandleNewline() {
        assertEquals(6, calc.Add("1\n2,3"));
        assertEquals(10, calc.Add("1,2\n3,4"));
    }

    @Test
    void testHandleDifferentDelimiters() {
        assertEquals(3, calc.Add("//;\n1;2"));
        assertEquals(6, calc.Add("//:\n1:2:3"));
        assertEquals(10, calc.Add("//'\n1'2'3'4"));
    }
}
