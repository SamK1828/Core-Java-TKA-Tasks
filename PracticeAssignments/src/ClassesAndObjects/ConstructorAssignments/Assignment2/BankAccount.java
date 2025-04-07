package ClassesAndObjects.ConstructorAssignments.Assignment2;

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(2001, "Sam K", 1000.0);
        acc.displayAccountDetails();
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);
        acc.displayAccountDetails();
    }
}

