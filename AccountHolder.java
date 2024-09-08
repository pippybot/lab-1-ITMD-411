import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AccountHolder {
    // Class fields
    private static double annualInterestRate = 0.04; // Hardcoded to 4%
    private double balance;

    // Constructor
    public AccountHolder(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Withdrawal method
    public void withdrawal(double amount) {
        if (balance - amount >= 50) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Error: Withdrawal denied. Balance must stay at least $50.");
        }
    }

    // Method to calculate and apply monthly interest
    public void monthlyInterest() {
        balance += balance * (annualInterestRate / 12.0);
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
