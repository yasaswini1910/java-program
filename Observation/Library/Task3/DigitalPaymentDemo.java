package basics;
interface PaymentService {
    void pay(String upiId, double amount);
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

    // Add money
    void addMoney(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                "Amount must be greater than zero."
            );
        }

        balance = balance + amount;
        System.out.println(amount + " added to wallet successfully.");
    }

    // Deduct money
    void deductMoney(double amount) {
        balance = balance - amount;
    }

    // Get balance
    double getBalance() {
        return balance;
    }

    // Display wallet details
    void displayWalletDetails() {
        System.out.println("----- Wallet Details -----");
        System.out.println("User Name: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Balance: " + balance);
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
    public void pay(String upiId, double amount) {

        try {
            // Validate UPI ID
            if (!upiId.contains("@") ||
                upiId.startsWith("@") ||
                upiId.endsWith("@")) {

                throw new InvalidUPIException(
                    "Invalid UPI ID."
                );
            }

            // Validate amount
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

            // Deduct payment amount
            wallet.deductMoney(amount);

            System.out.println(
                "Payment of " + amount +
                " made successfully to " + upiId
            );

        } catch (InvalidUPIException e) {
            System.out.println(
                "Transaction Failed: " + e.getMessage()
            );

        } catch (InvalidAmountException e) {
            System.out.println(
                "Transaction Failed: " + e.getMessage()
            );

        } catch (InsufficientBalanceException e) {
            System.out.println(
                "Transaction Failed: " + e.getMessage()
            );

        } finally {
            System.out.println(
                "Transaction process completed."
            );
        }
    }

    // Check balance
    @Override
    public void checkBalance() {
        System.out.println(
            "Available Balance: " + wallet.getBalance()
        );
    }
}

// Main Class
public class DigitalPaymentDemo {

    public static void main(String[] args) {

        // Create wallet
        Wallet wallet = new Wallet(
            "Sita",
            "9876543210",
            "sita@upi",
            5000
        );

        // Create payment object
        UPIPayment payment = new UPIPayment(wallet);

        // Display wallet details
        wallet.displayWalletDetails();

        System.out.println("\n----- Add Money -----");

        try {
            wallet.addMoney(2000);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----- Check Balance -----");
        payment.checkBalance();

        System.out.println("\n----- UPI Payment -----");
        payment.pay("anu@upi", 3000);

        System.out.println("\n----- Invalid UPI Test -----");
        payment.pay("anuupi", 500);

        System.out.println("\n----- Invalid Amount Test -----");
        payment.pay("anu@upi", -100);

        System.out.println("\n----- Insufficient Balance Test -----");
        payment.pay("anu@upi", 10000);

        System.out.println("\n----- Final Wallet Details -----");
        wallet.displayWalletDetails();

        System.out.println(
            "\nFinal Wallet Balance: " + wallet.getBalance()
        );
    }
}