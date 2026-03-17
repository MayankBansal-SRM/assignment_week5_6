LEVEL2 QUES 1

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // b. Define double arrays to save salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        
        // c. Define double arrays for new salary and bonus, plus total variables
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        System.out.println("--- Enter Details for 10 Employees ---");
        
        // d. Define a loop to take input with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter current salary: ");
            double currentSalary = scanner.nextDouble();
            System.out.print("Enter years of service: ");
            double serviceYears = scanner.nextDouble();
            
            // Validation: If invalid, ask again and decrement the counter
            if (currentSalary <= 0 || serviceYears < 0) {
                System.out.println("Invalid input! Salary must be > 0 and years of service cannot be negative. Please try again.");
                i--; // Decrement counter so this iteration repeats
                continue;
            }
            
            // Store valid inputs in arrays
            salary[i] = currentSalary;
            yearsOfService[i] = serviceYears;
        }
        
        // e. Define another loop to calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            // a. 5% bonus if > 5 years, else 2%
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }
            
            // Compute new salary
            newSalary[i] = salary[i] + bonusAmount[i];
            
            // Add to totals
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        // f. Print the total payouts
        System.out.println("\n=======================================");
        System.out.println("       ZARA COMPANY PAYOUT SUMMARY     ");
        System.out.println("=======================================");
        System.out.println("Total Old Salary Payout: Rs. " + totalOldSalary);
        System.out.println("Total Bonus Payout:      Rs. " + totalBonus);
        System.out.println("Total New Salary Payout: Rs. " + totalNewSalary);
        
        scanner.close();
    }
}