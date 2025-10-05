// (Count characters, words, and lines in a file)

// Write a program that will count the number of characters, words, and lines in a file. 
// Characters include whitespace characters " ", "\t", "\n", and "\r" and you must use Scanner 
// class to read input from a file. Words are separated by whitespace characters. 
// The file name should be passed as a command-line argument as: java Exercise FileA

// Sample Run

// File FileA has 
// 163 characters
// 22 words
// 6 lines
import java.util.Scanner;
import java.io.File;

public class Project1 {
    public static void main(String[] args) {
        int numChars = 0;
        int numWords = 0;
        int numLines = 0;

        try (Scanner input = new Scanner(new File(args[0]))){
            input.useDelimiter("\\Z");
            if (input.hasNext()) {
                String text = input.next();
                numChars = text.length();
            }
        }
        catch(java.io.IOException ex) {
                System.out.println(ex.toString());
        }
        try (Scanner input = new Scanner(new File(args[0]))){
            while (input.hasNext()) {
                input.next();
                numWords++;
            }
        }
        catch(java.io.IOException ex) {
                System.out.println(ex.toString());
        }
        try (Scanner input = new Scanner(new File(args[0]))){
            while (input.hasNext()) {
                input.nextLine();
                numLines++;
            }
        }
        catch(java.io.IOException ex) {
                System.out.println(ex.toString());
        }

        System.out.println("File FileA has");
        System.out.println("" + numChars + "characters");
        System.out.println("" + numWords + "words");
        System.out.println("" + numLines + "lines");
    }
}

        // try (Scanner input = new Scanner(new File(args[0]))){
        //     input.useDelimiter("\n");
        //     while (input.hasNext()) {
        //         numLines++;
        //         String line = input.next();
        //         numChars += line.length() + 1;
        //         numWords += line.split(" ").length;
        //     }
        // }
        // catch(java.io.IOException ex) {
        //         System.out.println(ex.toString());
        // }

        // System.out.println("File FileA has");
        // System.out.println("" + numChars + "characters");
        // System.out.println("" + numWords + "words");
        // System.out.println("" + numLines + "lines");