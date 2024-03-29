package midweek;
/*
6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */


import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// scanner created
        // Ask the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Generate and display the number triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
