/*
 * Create a BankAccount class with overloaded deposit() methods:
 */
package oops.polymorphism.assignment1;


public class BankAccount {

    private double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit an amount
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". Current balance: " + balance);
    }

    // Overloaded method to deposit with mode (cash/cheque)
    public void deposit(int amount, String mode) {
        balance += amount;
        System.out.println("Deposited " + amount + " via " + mode + ". Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        account.deposit(1000);                       // Deposit using amount
        account.deposit(2000, "Cheque");             // Deposit with mode (cheque)
    }
}

