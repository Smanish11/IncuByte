package co.incubyte;

public class StringCalculator {
    public int Add(String number) {
        int sum = 0; // variable to store sum
        String[] num = new String[number.length()]; // for splited elemnts
        String delimiter = ",";

        // Adding empty String (step I)
        if (number == "") {
            return 0;
        }

        // insert splited digits in a sting array(stepIII)
        for (int i = 0; i < number.length(); i++) {
            num = number.split(delimiter);
        }

        for (int i = 0; i < num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }

        return sum;
    }
}
