import java.util.Scanner;

// BankAccount class to represent the user's bank account
class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Method to check the balance of the account
    public double checkBalance() {
        return balance;
    }
}

// ATM class to represent the ATM machine
class ATM {
    private BankAccount account;

    // Constructor to connect ATM with user's bank account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method to display ATM menu and handle user input
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your current balance: $" + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Exiting. Thank you for using our ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}

public class atmInterface {
    public static void main(String[] args) {
        // Create a BankAccount object with initial balance of $1000
        BankAccount bankAccount = new BankAccount(1000);

        // Create an ATM object connected to the BankAccount
        ATM atm = new ATM(bankAccount);

        // Display the ATM menu
        atm.displayMenu();
    }
}

