level 1 ques 2

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a. Define an integer array of 5 elements
        int[] numbers = new int[5];

        // Get user input to store in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        // b & c. Loop through the array using length and check conditions
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // d. Compare the first and last element of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        
        System.out.println("\n--- Comparison ---");
        if (firstElement == lastElement) {
            System.out.println("First and last elements are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
        
        scanner.close();
    }
}