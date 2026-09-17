package tasks;

// Interface
interface PaymentService {

    void pay(String upiId, double amount)
            throws InvalidUPIException,
                  InvalidAmountException,              InsufficientBalanceException;

    void checkBalance();
}
// Custom Exception 1
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
// Custom Exception 2
class InvalidUPIException extends Exception {

    InvalidUPIException(String message) {
        super(message);
    }
}
// Custom Exception 3
class InvalidAmountException extends Exception {

    InvalidAmountException(String message) {
        super(message);
    }
}
// Wallet Class
class Wallet {

    // Private data members - Encapsulation
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
    Wallet(String userName, String mobileNumber,
           String upiId, double balance) {

        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    // Add money to wallet
    void addMoney(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero."
            );
        }

        balance = balance + amount;

        System.out.println("Money added successfully: Rs." + amount);
    }

    // Deduct money from wallet
    void deductMoney(double amount) {

        balance = balance - amount;
    }

    // Get balance
    double getBalance() {

        return balance;
    }

    // Get UPI ID
    String getUpiId() {

        return upiId;
    }

    // Display wallet details
    void displayWalletDetails() {

        System.out.println("\n===== WALLET DETAILS =====");
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.println("Balance       : Rs." + balance);
    }
}

// UPI Payment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
    UPIPayment(Wallet wallet) {

        this.wallet = wallet;
    }

    // Pay method
    @Override
    public void pay(String upiId, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID using String methods
        if (upiId == null ||
            !upiId.contains("@") ||
            upiId.startsWith("@") ||
            upiId.endsWith("@")) {

            throw new InvalidUPIException(
                    "Invalid UPI ID: " + upiId
            );
        }

        // Validate payment amount
        if (amount <= 0) {

            throw new InvalidAmountException(
                    "Payment amount must be greater than zero."
            );
        }

        // Check sufficient balance
        if (amount > wallet.getBalance()) {

            throw new InsufficientBalanceException(
                    "Insufficient wallet balance."
            );
        }

        // Deduct amount from wallet
        wallet.deductMoney(amount);

        // Payment successful
        System.out.println("Payment successful!");
        System.out.println("Paid to     : " + upiId);
        System.out.println("Amount paid : Rs." + amount);
    }


    // Check balance
    @Override
    public void checkBalance() {

        System.out.println(
                "Available Balance: Rs." + wallet.getBalance()
        );
    }
}


// Main Class
public class UPIPaymentDemo {

    public static void main(String[] args) {

        // Create Wallet object
        Wallet wallet = new Wallet(
                "Rahul",
                "9876543210",
                "rahul@upi",
                5000
        );


        // Create UPIPayment object
        PaymentService payment = new UPIPayment(wallet);


        // Display initial wallet details
        wallet.displayWalletDetails();


        // Add money
        System.out.println("\n===== ADD MONEY =====");

        try {

            wallet.addMoney(2000);

        } catch (InvalidAmountException e) {

            System.out.println("Error: " + e.getMessage());
        }


        // Check balance
        System.out.println("\n===== BALANCE =====");

        payment.checkBalance();


        // Transaction 1 - Successful Payment
        System.out.println("\n===== TRANSACTION 1 =====");

        try {

            payment.pay("arun@upi", 2000);

        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println(
                    "Transaction failed: " + e.getMessage()
            );

        } finally {

            System.out.println("Transaction 1 completed.");
        }


        // Transaction 2 - Invalid UPI
        System.out.println("\n===== TRANSACTION 2 =====");

        try {

            payment.pay("invalidupi", 1000);

        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println(
                    "Transaction failed: " + e.getMessage()
            );

        } finally {

            System.out.println("Transaction 2 completed.");
        }


        // Transaction 3 - Invalid Amount
        System.out.println("\n===== TRANSACTION 3 =====");

        try {

            payment.pay("priya@upi", -500);

        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println(
                    "Transaction failed: " + e.getMessage()
            );

        } finally {

            System.out.println("Transaction 3 completed.");
        }


        // Transaction 4 - Insufficient Balance
        System.out.println("\n===== TRANSACTION 4 =====");

        try {

            payment.pay("kiran@upi", 10000);

        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println(
                    "Transaction failed: " + e.getMessage()
            );

        } finally {

            System.out.println("Transaction 4 completed.");
        }

        // Display final wallet details
        wallet.displayWalletDetails();

        // Display final balance
        System.out.println("\n===== FINAL BALANCE =====");

        payment.checkBalance();
    }
}