package basics;
class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    // Constructor
    Account(int accountNumber, String accountHolderName,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Transfer method
    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println(amount + " transferred successfully.");
        } else {
            System.out.println("Insufficient balance for transfer.");
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

    SavingsAccount(int accountNumber, String accountHolderName,
                   double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Calculate interest
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;
        System.out.println("Interest added: " + interest);
    }
}

// Current Account
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolderName,
                   double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}

// Main class
public class BankAccountDemo {
    public static void main(String[] args) {

        // Creating objects
        SavingsAccount savings =
            new SavingsAccount(101, "Sita", 10000, 5);

        CurrentAccount current =
            new CurrentAccount(102, "Anu", 5000, 3000);

        System.out.println("----- BEFORE TRANSACTIONS -----");

        savings.displayAccountDetails();
        System.out.println();

        current.displayAccountDetails();

        System.out.println("\n----- TRANSACTIONS -----");

        // Deposit
        savings.deposit(2000);

        // Withdrawal
        savings.withdraw(1000);

        // Interest calculation
        savings.calculateInterest();

        // Current account withdrawal
        current.withdraw(7000);

        // Fund transfer
        savings.transfer(current, 2000);

        System.out.println("\n----- AFTER TRANSACTIONS -----");

        savings.displayAccountDetails();
        System.out.println();

        current.displayAccountDetails();

        System.out.println("\nFinal Balance of Savings Account: "
                           + savings.balance);

        System.out.println("Final Balance of Current Account: "
                           + current.balance);
    }
}