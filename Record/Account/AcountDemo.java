package core_java;

class Account {
    int accountNumber;
    double balance;
    String accountType;

    Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Interest: " + interest);
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }
}

public class AccountDemo {
    public static void main(String[] args) {

        Account acc = new Account(1001, 10000, "Savings");

        acc.display();

        acc.deposit(2000);

        acc.withdraw(3000);

        acc.calculateInterest();

        acc.display();
    }
}