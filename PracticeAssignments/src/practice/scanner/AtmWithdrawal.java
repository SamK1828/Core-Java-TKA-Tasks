package practice.scanner;

import java.util.Scanner;

public class AtmWithdrawal {
	// ATM Withdrawal Program
	static Scanner sc = new Scanner(System.in);
	static int pin = 1828;

	public void checkPin(int p) {
		while (p != pin) {
			System.out.println("Invalid Pin!!\nEnter Pin Again To Proceed!!!! ");
			System.out.print("Enter Pin: ");
			p = sc.nextInt();
		}
		System.out.println("Pin was Correct!! Processing....");
	}

	public boolean checkBalance(int balance, int amt) {
		if (amt > balance) {
			System.out.println("Insufficient Balance to Withdraw Money....");
			return false;
		} else {
			balance -= amt;
			System.out.println("Amount Withdrawn Successfully!!!\nTake Cash From Below....\n\nTake The Receipt!!!!\n");
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("***********************Welcome to SK Bank*****************************");
		System.out.println("Insert Your ATM Card and Type 'Y'");
		AtmWithdrawal obj = new AtmWithdrawal();
		int balance = 10000;
		sc.next();
		System.out.println("****************Card Inserted and Checked Successfully****************");
		System.out.println("======================================================================");
		System.out.println("***********************Welcome to SK Bank*****************************");
		System.out.println("Available Balance: " + balance + "/-");
		System.out.println("Enter Your Amount for Withdrawal:");
		int amt = sc.nextInt();
		System.out.println("Enter Your Pin To Proceed:");
		obj.checkPin(sc.nextInt());
		obj.checkBalance(balance, amt);

		sc.close();
	}
}
