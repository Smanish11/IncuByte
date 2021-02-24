package co.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestStringCalculator {
    @Test
    void testZeroOrOneDigits() {
        StringCalculator calc = new StringCalculator();
        // Only 1 number
        assertEquals(6, calc.Add("6"));
        // No numbers
        assertEquals(0, calc.Add(""));
    }
}
