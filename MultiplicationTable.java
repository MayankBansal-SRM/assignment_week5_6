ques 3 level 1

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // a. Get an integer input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Define an integer array to store the results
        int[] tableResults = new int[10];

        // b. Run a loop from 1 to 10 and store the results
        for (int i = 0; i < 10; i++) {
            tableResults[i] = number * (i + 1);
        }

        System.out.println("\n--- Multiplication Table for " + number + " ---");
        // c. Display the result from the array
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + tableResults[i]);
        }
        
        scanner.close();
    }
}