package midweek;

import java.util.Scanner;

/*
15. Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
 */
public class Question_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner created
        System.out.println("Enter Number of Rows: "); // printing a statement to enter a data
        int rows = scanner.nextInt(); // going into next line
        Question_15 obj = new Question_15();
        obj.triangle(rows); //

    }
    public void triangle(int rows) {
        //nested for loop
        for (int i = 1; i <= rows; i++) {
            for (int a = 1; a <= i; a++){
                System.out.print("* "); //Print statement
            }
            System.out.println(); //print statement used to add a line after each row
        }
    }

}
