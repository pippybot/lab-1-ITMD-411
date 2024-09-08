import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class AccountHolderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for initial balance
        System.out.print("Enter initial account balance: ");
        double initialBalance = scanner.nextDouble();
        AccountHolder accountHolder = new AccountHolder(initialBalance);

        // Prompt user for deposit amount
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        accountHolder.deposit(depositAmount);

        // Prompt user for withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        accountHolder.withdrawal(withdrawalAmount);

        // Apply monthly interest
        accountHolder.monthlyInterest();

        // Display the balance
        System.out.println("Final balance after applying monthly interest: $" + accountHolder.getBalance());

        // Display the 12-month interest report
        System.out.println("\nMonth\tBalance");
        System.out.println("----\t-------");
        System.out.println("Base\t$" + initialBalance);
        for (int month = 1; month <= 12; month++) {
            accountHolder.monthlyInterest();
            System.out.println(month + "\t$" + accountHolder.getBalance());
        }

        // Print current date, time, and programmer name
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("\nCur dt=" + timeStamp + "\nProgrammed by Evelyn Myers\n");

        scanner.close();
    }
}
