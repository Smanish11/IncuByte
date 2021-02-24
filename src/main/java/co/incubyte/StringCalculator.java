package co.incubyte;

public class StringCalculator {
    public int Add(String numbers) {
        // If no numbers are there in the input, return 0
        if (numbers == "")
            return 0;
        // If only 1 number is in the input, return that number
        return Integer.parseInt(numbers);
    }
}
