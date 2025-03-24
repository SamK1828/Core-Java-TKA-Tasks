package IterativeStatementsAssignments;

public class PracticeQn_2 {
	public static void main(String[] args) {
		// Prime or Composite
		System.out.println("Check Prime or Composite...");
		int num = 121;
		boolean flag = true;
		int j = 2;
		while (j < num/2) {
			if (num % j == 0) {
				flag = false;
				break;
			}
			j++;
		}
		if (!flag)
			System.out.println(num + " is Composite");
		else
			System.out.println(num + " is Prime");

		// 2. Check vowels and consonants using switch case and for loop
		String str = "Hello";
		for (int i = 0; i < str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch + " is a Vowel");
				break;
			default:
				if (Character.isLetter(ch)) {
					System.out.println(ch + " is a Consonant");
				}
			}
		}
//
		// 3. Reverse a number using while loop and check if even or odd
		int number = 1234, reverse = 0, temp = number;
		while (temp > 0) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println("Reversed Number: " + reverse);
		System.out.println(reverse + " is " + (reverse % 2 == 0 ? "Even" : "Odd"));

		// 4. Find the sum of digits using do-while loop and check if prime
		int digitNum = 29, sumDigits = 0, tempNum = digitNum;
		do {
			sumDigits += tempNum % 10;
			tempNum /= 10;
		} while (tempNum > 0);
		System.out.println("Sum of digits: " + sumDigits);

		boolean isSumPrime = true;
		if (sumDigits <= 1) {
			isSumPrime = false;
		} else {
			for (int i = 2; i <= sumDigits / 2; i++) {
				if (sumDigits % i == 0) {
					isSumPrime = false;
					break;
				}
			}
		}
		System.out.println(sumDigits + " is " + (isSumPrime ? "Prime" : "Not Prime"));

		// 5. Check if a number is a palindrome, but if the number is less than 500,
		// print "Invalid Input"
		int palindromeCheck = 121, revNum = 0, tempPalin = palindromeCheck;
		if (palindromeCheck < 500) {
			System.out.println("Invalid Input");
		} else {
			while (tempPalin > 0) {
				revNum = revNum * 10 + tempPalin % 10;
				tempPalin /= 10;
			}
			System.out
					.println(palindromeCheck + " is " + (palindromeCheck == revNum ? "Palindrome" : "Not Palindrome"));
		}
//
		// 6. Print the Fibonacci series up to N terms, but stop the loop if a number in
		// the series is prime
		int n = 10, a = 0, b = 1, nextTerm;
		System.out.print("Fibonacci Series: " + a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			nextTerm = a + b;
			a = b;
			b = nextTerm;
			System.out.print(nextTerm + " ");
			// if (isPrime(nextTerm)) {
			// 	System.out.println("\nPrime number found, stopping loop.");
			// 	break;
			// }
			System.out.println("Check Prime or Composite...");
			num = nextTerm;
			j = 2;
			while (j < num/2) {
				if (num % j == 0) {
					flag = false;
					break;
				}
				j++;
			}
			if (flag){
				System.out.println("\nPrime number found, stopping loop.");
				break;}
		}
		// 7. Check if a given year is a leap year or not using if-else
		int year = 2024;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}
//
//		// 8. Check if a number is a Perfect Square, but if the number is less than 100,
//		// print "Invalid Input"
//		int squareCheck = 144;
//		if (squareCheck < 100) {
//			System.out.println("Invalid Input");
//		} else {
//			int sqrt = 1;
//			boolean isPerfectSquare = false;
//			while (sqrt * sqrt <= squareCheck) {
//				if (sqrt * sqrt == squareCheck) {
//					isPerfectSquare = true;
//					break;
//				}
//				sqrt++;
//			}
//			System.out.println(squareCheck + " is " + (isPerfectSquare ? "a Perfect Square" : "Not a Perfect Square"));
//		}

	}
}
