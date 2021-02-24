package co.incubyte;

import java.util.regex.Pattern;

public class StringCalculator {
    private int addCallCounter = 0;

    public int GetCalledCount() {
        return addCallCounter;
    }

    public int Add(String number) throws Exception {
        // Incrementing call counter
        ++addCallCounter;

        int sum = 0; // variable to store sum
        String[] num = new String[number.length()]; // for splited elemnts
        String delimiter = ",";

        // Adding empty String
        if (number == "")
            return 0;

        if (number.charAt(0) == '/' && number.charAt(1) == '/') {
            delimiter = number.split("\n")[0];
            delimiter = delimiter.substring(3, delimiter.length() - 1);
            number = number.substring(3 + delimiter.length() + 2);
            delimiter = Pattern.quote(delimiter);
        }

        number = number.replaceAll("\n", delimiter); // replace all new lines with ","

        // Insert splited digits in a sting array
        num = number.split(delimiter);

        try { // Handle negative number Exeption
            for (int i = 0; i < num.length; i++) {
                // Allow the add method to handle an unknown ammount of numbers
                if (Integer.parseInt(num[i]) < 0)
                    throw new Exception();

                // If number > 1000, ignore it
                if (Integer.parseInt(num[i]) > 1000)
                    continue;

                sum += Integer.parseInt(num[i]);
            }

        } catch (Exception e) {
            String s = "negatives not allowed ";

            for (int i = 0; i < num.length; i++) {
                if (Integer.parseInt(num[i]) < 0) {
                    s += num[i] + " ";
                }
            }

            throw new Exception(s); // Throw negatives not allowed Exception
        }
        // Final sum
        return sum;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new StringCalculator().Add("//[***]\n1***2***3"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
