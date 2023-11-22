package Task3;

import java.util.Scanner;

public class ATM {
    private static double balance = 10000; // Initial balance

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose 1 for Check Balance");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Withdraw");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            switch  (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            // Ask the user if they want to continue
            System.out.print("Would you like to continue? (yes/no): ");
            String continueChoice = sc.next().toLowerCase();

            if (!continueChoice.equals("yes")) {
                System.out.println("Exiting ATM. Thank you!");
                break;
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
