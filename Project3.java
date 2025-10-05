// (The EvenNumber class)

// Define the EvenNumber class for representing an even number. The class contains:

// A data field value of the int type that represents the integer value stored in the object.
// A no-arg constructor that creates an EvenNumber object for the value 0.
// A constructor that constructs an EvenNumber object with the specified value. 
// If the value is not even, throw a RuntimeException with message "value not even".
// A method named getValue() to return an int value for this object.
// A method named getNext() to return an EvenNumber object that represents the next 
// even number after the current even number in this object.
// A method named getPrevious() to return an EvenNumber object that represents 
// the previous even number before the current even number in this object.
// Sample Run 1

// Enter an integer: 101
// Exception: value not even
// Sample Run 2

// Enter an integer: 16
// Current number is 16
// Next even number is 18
// Previous even number is 14
import java.util.Scanner;

class EvenNumber {
    private int value;

    private void checkEven(int value) {
        if (value % 2 != 0)
            throw new RuntimeException("Exception: value not even");
    }

    EvenNumber() {
        this(0);
    }

    EvenNumber(int value) {
        checkEven(value);
        this.value = value;
    }

    int getValue() {
        return this.value;
    }

    EvenNumber getNext() {
        return new EvenNumber(this.value + 2);
    }

    EvenNumber getPrevious() {
        return new EvenNumber(this.value - 2);
    }
}


public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EvenNumber number;
        int userNum = input.nextInt();

        try {
            number = new EvenNumber(userNum);

            System.out.println("Current number is " + number.getValue());
            System.out.println("Next even number is " + number.getNext().getValue());
            System.out.println("Previous even number is " + number.getPrevious().getValue());
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}