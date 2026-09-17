package tasks;

public class Account {
    String accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    // Constructor
    Account(String accountNumber, String accountHolderName,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
           System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Withdraw
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    // Transfer
    void transfer(Account receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;          System.out.println("Transferred: " + amount);
            System.out.println("From: " + accountNumber);
            System.out.println("To: " + receiver.accountNumber);
        } else {
            System.out.println("Transfer failed.");
        }
    }
    // Display account details
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}
// Savings Account
class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolderName,
                   double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Calculate interest
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;

        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Added: " + interest);
    }
}
// Current Account
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(String accountNumber, String accountHolderName,
                   double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }
    // Method overriding
    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}
// Main class
public class BankAccountDemo {
    public static void main(String[] args) {

        // Creating objects
        SavingsAccount savings = new SavingsAccount(
                "S101", "Raji", 10000, 5
        );

        CurrentAccount current = new CurrentAccount(
                "C101", "Akshaya", 5000, 3000
        );

        // Before transactions
        System.out.println("===== BEFORE TRANSACTIONS =====");

        System.out.println("\nSavings Account:");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account:");
        current.displayAccountDetails();

        // Deposits
        System.out.println("\n===== DEPOSITS =====");
        savings.deposit(2000);
        current.deposit(3000);

        // Withdrawals
        System.out.println("\n===== WITHDRAWALS =====");
        savings.withdraw(1000);
        current.withdraw(7000);

        // Interest
        System.out.println("\n===== INTEREST CALCULATION =====");
        savings.calculateInterest();

        // Transfer
        System.out.println("\n===== FUND TRANSFER =====");
        savings.transfer(current, 2000);

        // After transactions
        System.out.println("\n===== AFTER TRANSACTIONS =====");

        System.out.println("\nSavings Account:");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account:");
        current.displayAccountDetails();

        // Final balances
        System.out.println("\n===== FINAL BALANCES =====");
        System.out.println("Savings Account Balance: " + savings.balance);
        System.out.println("Current Account Balance: " + current.balance);
    }
}