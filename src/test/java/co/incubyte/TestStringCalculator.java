package co.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestStringCalculator {
    @Test
    void testZeroOrOneDigits() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.Add("6"));
        assertEquals(0, calc.Add(""));
    }
}
