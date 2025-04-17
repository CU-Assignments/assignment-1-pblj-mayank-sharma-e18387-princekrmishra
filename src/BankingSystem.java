import java.util.Scanner;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Account creation
        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Account Number: ");
        String accNo = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account(name, accNo, balance);

        // Deposit
        System.out.print("Deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdraw
        System.out.print("Withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        scanner.close();
    }
}
