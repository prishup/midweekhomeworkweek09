package midweek;
/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.maxMin();                // method calling in main method

    }

    public static void maxMin() {
        Scanner scanner = new Scanner(System.in);//
        System.out.println("Enter Number");   //given

        int min = Integer.MIN_VALUE; //formula of min number
        int max = Integer.MAX_VALUE;  //formula of max number
        while (true) { //endless while loop


            int number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            } else {
                System.out.println("Minimum number is : " + min);
                System.out.println("Maximum Number is : "  + max);
            }
        }
    }}














