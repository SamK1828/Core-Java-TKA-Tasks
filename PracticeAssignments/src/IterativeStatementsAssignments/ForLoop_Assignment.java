package IterativeStatementsAssignments;

public class ForLoop_Assignment {
	public static void main(String[] args) {
		// 1. Print Numbers from 1 to 100
		System.out.println("Numbers from 1 to 100:");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// 2. Print Even Numbers from 2 to 100
		System.out.println("Even Numbers from 2 to 100:");
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// 3. Sum of First N Natural Numbers
		int N = 10; // Predefined value for N
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		System.out.println("Sum of first " + N + " natural numbers: " + sum + "\n");

		// 4. Print a Multiplication Table for a Number N
		int num = 5; // Predefined number for the multiplication table
		System.out.println("Multiplication Table of " + num + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		System.out.println();

		// 5. Reverse Order Printing (100 to 1)
		System.out.println("Numbers from 100 to 1 in reverse order:");
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// 6. Factorial of a Number
		int factorialNum = 5; // Predefined value for factorial calculation
		int factorial = 1;
		for (int i = 1; i <= factorialNum; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of " + factorialNum + " is: " + factorial + "\n");

		// 7. Print the Fibonacci Series
		int fibTerms = 10; // Number of terms to print
		int first = 0, second = 1;
//		System.out.println("First " + fibTerms + " terms of the Fibonacci series:");
//		for (int i = 1; i <= fibTerms; i++) {
//			System.out.print(first + " ");
//			int next = first + second;
//			first = second;
//			second = next;
//		}
		
		//Alternate method for Fibonaaci 
		System.out.println("Alternate Fibonaaci Method");
		for(int i=0;i<fibTerms;i++) {
			System.out.print(first+" ");
			second=first+second;
			first=second-first;
		}
		System.out.println("\n");

		// 8. Sum of Digits of a Number
		int digitNum = 12345; // Predefined number
		int digitSum = 0, tempNum = digitNum;
		for (; tempNum > 0; tempNum /= 10) {
			digitSum += tempNum % 10;
		}
		System.out.println("Sum of digits of " + digitNum + " is: " + digitSum + "\n");

		// 9. Reverse a Number
		int reverseNum = 98765; // Predefined number
		int reversed = 0, tempRev = reverseNum;
		for (; tempRev > 0; tempRev /= 10) {
			reversed = reversed * 10 + tempRev % 10;
		}
		System.out.println("Reversed number of " + reverseNum + " is: " + reversed);
	}
}
