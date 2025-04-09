package practice.scannerAssignment2;
import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, balance);
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.showBalance();
        sc.close();
    }
}
