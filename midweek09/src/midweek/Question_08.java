package midweek;

import java.util.Scanner;

/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */
public class Question_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner created
        System.out.println("Enter Number of Rows: "); // printing a statement to enter a data
        int rows = scanner.nextInt(); // going into next line
       Question_08 obj = new Question_08();
        obj.triangle(rows);

    }

    public void triangle(int rows) {
        //for loop
        for (int i = 1; i <= rows; i++) {
            for (int a = 1; a <= i; a++){
                System.out.print("@ "); //Print statement
            }
            System.out.println(); //print statement used to add a line after each row
        }
    }
}


