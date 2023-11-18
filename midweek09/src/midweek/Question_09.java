package midweek;

import java.util.Scanner;

/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Question_09 {
    public static void main(String[] args) {
        Question_09 obj = new Question_09();
        obj.isFibonacciNumber(); // calling method in main method
    }

    public void isFibonacciNumber() { // method created
        Scanner scanner = new Scanner(System.in); // scanner created
        System.out.println("Enter the Fibonacci Number");
        int fibonacciNumber = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.println(num1 + "" + num2);
        for (int i = 2; i < fibonacciNumber; i++) {
            num3 = num1 + num2;
            System.out.println("  " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}


