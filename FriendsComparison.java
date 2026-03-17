import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Storing the names to easily reference them later
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // a. Define arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("--- Enter Details for Amar, Akbar, and Anthony ---");
        
        // Take user input for the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails for " + names[i] + ":");
            System.out.print("Enter Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter Height: ");
            heights[i] = scanner.nextDouble();
        }
        
        // b. Loop through the array to find youngest and tallest
        // We assume the first friend (index 0) is the youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        for (int i = 1; i < 3; i++) {
            // Check for youngest
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            // Check for tallest
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // c. Finally display the youngest and tallest
        System.out.println("\n=======================================");
        System.out.println("The youngest friend is: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("The tallest friend is:  " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");
        
        scanner.close();
    }
}