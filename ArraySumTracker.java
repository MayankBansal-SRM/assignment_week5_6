level 1 ques 4

import java.util.Scanner;



public class ArraySumTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // a. Create array, total variable, and index variable
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Use infinite while loop
        while (true) {
            // d. break from loop if index has a value of 10
            if (index == 10) {
                System.out.println("Maximum capacity of 10 reached.");
                break;
            }
            
            // c. Take user entry
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double entry = scanner.nextDouble();

            // Check if user entered 0 or negative to break
            if (entry <= 0) {
                break;
            }

            // e. Assign number to array and increment index
            numbers[index] = entry;
            index++;
        }

        System.out.println("\n--- Results ---");
        System.out.print("Numbers entered: ");
        
        // f. Take another for loop to get values and add to total
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + "  ");
            total += numbers[i];
        }
        
        // g. Finally display the total value
        System.out.println("\nThe sum of all numbers is: " + total);
        
        scanner.close();
    }
}