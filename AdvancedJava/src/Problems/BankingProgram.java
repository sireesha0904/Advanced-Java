package Problems;

import java.util.Scanner;

public class BankingProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0; // Initial balance
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("*******************************");
            System.out.println("Banking Program");
            System.out.println("*******************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*******************************");

            // Get user's choice
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;

                case 2:
                    balance = deposit(balance); // update balance
                    break;

                case 3:
                    balance = withdraw(balance); // update balance
                    break;

                case 4:
                    isRunning = false; // Fix: correctly update the running flag
                    System.out.println("Thank you for using the Banking Program!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please enter 1-4.");
            }
        }

        sc.close(); // Close scanner after use
    }

    // Show balance
    static void showBalance(double balance) {
        System.out.println("Your current balance is: Rs " + balance);
    }

    // Deposit method
    static double deposit(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount to deposit: Rs ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("You deposited: Rs " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }

        return balance;
    }

    // Withdraw method
    static double withdraw(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount to withdraw: Rs ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You withdrew: Rs " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }

        return balance;
    }
}
