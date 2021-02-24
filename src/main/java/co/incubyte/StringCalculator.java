package co.incubyte;

public class StringCalculator {
    public int Add(String numbers) {
        if (numbers == "")
            return 0;
        return Integer.parseInt(numbers);
    }
}
