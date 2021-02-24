package co.incubyte;

public class StringCalculator {
    public int Add(String number) {
        int sum = 0; // variable to store sum
        String[] num = new String[number.length()]; // for splited elemnts
        String delimiter = ",";

        // Adding empty String
        if (number == "")
            return 0;

        if (number.charAt(0) == '/' && number.charAt(1) == '/') { // handle [delimiter]/n[number] (step VII)
            delimiter = String.valueOf(number.charAt(2));
            number = number.substring(4);

        }

        number = number.replaceAll("\n", ","); // replace all new lines with ","
        number = number.replaceAll("\n", delimiter); // replace all new lines with given delimiter

        // Insert splited digits in a sting array
        for (int i = 0; i < number.length(); i++) {
            num = number.split(delimiter);
        }

        for (int i = 0; i < num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }

        return sum;
    }
}
