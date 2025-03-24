package IterativeStatementsAssignments;

public class DoWhileLoop_Assignment {
	public static void main(String[] args) {
		int n = 10; // For sum, factorial, and multiplication table
		int number = 1234; // For reversing, counting, and sum of digits
		int num1 = 56, num2 = 98; // For GCD
		int fibTerms = 10; // Fibonacci terms

		// 1. Print numbers from 1 to 10 using a while loop
		System.out.println("Numbers from 1 to 10 using while loop:");
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n");

		// 2. Print numbers from 1 to 10 using a do-while loop
		System.out.println("Numbers from 1 to 10 using do-while loop:");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 10);
		System.out.println("\n");

		// 3. Print even numbers from 1 to 20 using a while loop
		System.out.println("Even numbers from 1 to 20 using while loop:");
		i = 2;
		while (i <= 20) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println("\n");

		// 4. Print odd numbers from 1 to 20 using a do-while loop
		System.out.println("Odd numbers from 1 to 20 using do-while loop:");
		i = 1;
		do {
			System.out.print(i + " ");
			i += 2;
		} while (i <= 20);
		System.out.println("\n");

		// 5. Print sum of numbers from 1 to N using a while loop
		System.out.println("Sum of numbers from 1 to " + n + " using while loop:");
		i = 1;
		int sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("Sum: " + sum + "\n");

		// 6. Print sum of numbers from 1 to N using a do-while loop
		System.out.println("Sum of numbers from 1 to " + n + " using do-while loop:");
		i = 1;
		sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= n);
		System.out.println("Sum: " + sum + "\n");

		// 7. Reverse a number using a while loop
		System.out.println("Reversing " + number + " using while loop:");
		int temp = number, reverse = 0;
		while (temp > 0) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println("Reversed: " + reverse + "\n");

		// 8. Reverse a number using a do-while loop
		System.out.println("Reversing " + number + " using do-while loop:");
		temp = number;
		reverse = 0;
		do {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		} while (temp > 0);
		System.out.println("Reversed: " + reverse + "\n");

		// 9. Count the number of digits using a while loop
		System.out.println("Counting digits in " + number + " using while loop:");
		temp = number;
		int count = 0;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		System.out.println("Number of digits: " + count + "\n");

		// 10. Count the number of digits using a do-while loop
		System.out.println("Counting digits in " + number + " using do-while loop:");
		temp = number;
		count = 0;
		do {
			temp /= 10;
			count++;
		} while (temp > 0);
		System.out.println("Number of digits: " + count + "\n");

		// 11. Sum of digits using a while loop
		System.out.println("Sum of digits of " + number + " using while loop:");
		temp = number;
		sum = 0;
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println("Sum of digits: " + sum + "\n");

		// 12. Sum of digits using a do-while loop
		System.out.println("Sum of digits of " + number + " using do-while loop:");
		temp = number;
		sum = 0;
		do {
			sum += temp % 10;
			temp /= 10;
		} while (temp > 0);
		System.out.println("Sum of digits: " + sum + "\n");

		// 13. Print multiplication table of N using a while loop
		System.out.println("Multiplication table of " + n + " using while loop:");
		i = 1;
		while (i <= 10) {
			System.out.println(n + " x " + i + " = " + (n * i));
			i++;
		}
		System.out.println();

		// 14. Print multiplication table of N using a do-while loop
		System.out.println("Multiplication table of " + n + " using do-while loop:");
		i = 1;
		do {
			System.out.println(n + " x " + i + " = " + (n * i));
			i++;
		} while (i <= 10);
		System.out.println();

		// 15. Find factorial of N using a while loop
		System.out.println("Factorial of " + n + " using while loop:");
		long fact = 1;
		i = n;
		while (i > 0) {
			fact *= i;
			i--;
		}
		System.out.println("Factorial: " + fact + "\n");

		// 16. Find factorial of N using a do-while loop
		System.out.println("Factorial of " + n + " using do-while loop:");
		fact = 1;
		i = n;
		do {
			fact *= i;
			i--;
		} while (i > 0);
		System.out.println("Factorial: " + fact + "\n");

		// 17. Print Fibonacci series using a while loop
		System.out.println("Fibonacci series up to " + fibTerms + " terms using while loop:");
		int a = 0, b = 1, next, j = 1;
		while (j <= fibTerms) {
			System.out.print(a + " ");
			next = a + b;
			a = b;
			b = next;
			j++;
		}
		System.out.println("\n");

		// 18. Find GCD of two numbers using a while loop
		System.out.println("GCD of " + num1 + " and " + num2 + " using while loop:");
		int x = num1, y = num2;
		while (y != 0) {
			int tempGcd = y;
			y = x % y;
			x = tempGcd;
		}
		System.out.println("GCD: " + x + "\n");

		// 19. Check if a number is a palindrome using a do-while loop
		number = 1221;
		System.out.println("Checking if " + number + " is a palindrome using do-while loop:");

		temp = number;
		reverse = 0;
		do {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		} while (temp > 0);
		if (number == reverse) {
			System.out.println(number + " is a palindrome.\n");
		} else {
			System.out.println(number + " is not a palindrome.\n");
		}

		// 20. Find the sum of all even digits in a number using a do-while loop
		System.out.println("Sum of all even digits in " + number + " using do-while loop:");
		temp = number;
		sum = 0;
		do {
			int digit = temp % 10;
			if (digit % 2 == 0) {
				sum += digit;
			}
			temp /= 10;
		} while (temp > 0);
		System.out.println("Sum of even digits: " + sum);
	}
}
