package co.incubyte;

public class StringCalculator {
    public int Add(String number) throws Exception {
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

        // Insert splited digits in a sting array
        for (int i = 0; i < number.length(); i++) {
            num = number.split(delimiter);
        }

        try { // Handle negative number Exeption
            for (int i = 0; i < num.length; i++) {
                // Allow the add method to handle an unknown ammount of numbers
                if (Integer.parseInt(num[i]) < 0) {
                    throw new Exception();
                }
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
}
