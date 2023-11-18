package midweek;
/*
3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) { // main method
        Question_03 obj = new Question_03();
        obj.vowel(); // calling method vowel() in main method
    }
    public void vowel() { // method created
        Scanner scanner = new Scanner(System.in);//scanner created
        System.out.println("Enter Alphabet (a to z)");
        String alphabet = scanner.nextLine();
        if (alphabet.length() > 1) {
            System.out.println("String length is >1");
        } else {
            switch (alphabet.toLowerCase()) {//switch syntax to identify vowels
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println(alphabet + " is vowel"); // if user input is vowel
                    break;
                default:
                    System.out.println(alphabet + " is consonant");// if user's input is not vowel
            }

        }
    }


}
