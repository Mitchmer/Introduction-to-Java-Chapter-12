// (NumberFormatException)

// Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number. 
// The method throws a NumberFormatException if the string is not a binary string.

// Write a main method that prompts the user to enter a binary number as a string and 
// displays decimal equivalent of the string. If the method throws an exception, display "Not a binary number"

// For a hint on this program, please see https://liveexample.pearsoncmg.com/javarevel13e.html.
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long convertedString;
        try {
            convertedString = bin2dec(input.next());
            System.out.println(convertedString);
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    public static long bin2dec(String binaryString) throws NumberFormatException {
        String reverseString = new StringBuilder(binaryString).reverse().toString();
        // look at the ith character, and multiply it by 2^i and add to a total
        long convertedString = 0;
        for (int i = 0; i < reverseString.length(); i++) {

            char c = reverseString.charAt(i);
            if (c != '\n') {
                if (c != '1' && c != '0')
                    throw new NumberFormatException("Not a binary number");
                convertedString += (long)(Math.pow((2 * (c - '0')), i));
            }
            else break;
        }
        return convertedString;
    }
}