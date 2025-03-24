package ControlStatementsAssignments;

public class SwitchAndIf_ElseAssignments {
	public static void main(String[] args) {
		// 1. Convert Number (1-7) into a Weekday
		int dayNumber = 3;

		System.out.print("Day " + dayNumber + ": ");

		switch (dayNumber) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day number!");
		}
		System.out.println();

		// 2. Convert Grade into Remarks
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("Grade " + grade + ": Excellent");
			break;
		case 'B':
			System.out.println("Grade " + grade + ": Good");
			break;
		case 'C':
			System.out.println("Grade " + grade + ": Average");
			break;
		case 'D':
			System.out.println("Grade " + grade + ": Poor");
			break;
		case 'F':
			System.out.println("Grade " + grade + ": Fail");
			break;
		default:
			System.out.println("Invalid Grade");
		}
		System.out.println();

		// 3. Zodiac Sign Based on Month & Date
		int month = 3, day = 88;
		String zodiac = "";
		switch (month) {
		case 1:
			if (day >= 20) {
				zodiac = "Aquarius";
			} else {
				if (day > 31) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Capricorn";
			}
			break;
		case 2:
			if (day >= 19 && day <= 28) {
				zodiac = "Pisces";
			} else {
				if (day > 28) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Aquarius";
			}
			break;
		case 3:
			if (day >= 21 && day <= 31) {
				zodiac = "Aries";
			} else {
				if (day > 31) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Pisces";
			}
			break;
		case 4:
			if (day >= 20) {
				zodiac = "Taurus";
			} else {
				zodiac = "Aries";
			}
			break;
		case 5:
			if (day >= 21) {
				zodiac = "Gemini";
			} else {
				if (day > 31) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Taurus";
			}
			break;
		case 6:
			if (day >= 21) {
				zodiac = "Cancer";
			} else {
				zodiac = "Gemini";
			}
			break;
		case 7:
			if (day >= 23) {
				zodiac = "Leo";
			} else {
				if (day > 31) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Cancer";
			}
			break;
		case 8:
			if (day >= 23) {
				zodiac = "Virgo";
			} else {
				if (day > 30) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Leo";
			}
			break;
		case 9:
			if (day >= 23) {
				zodiac = "Libra";
			} else {
				if (day > 31) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Virgo";
			}
			break;
		case 10:
			if (day >= 23) {
				zodiac = "Scorpio";
			} else {
				if (day > 30) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Libra";
			}
			break;
		case 11:
			if (day >= 22) {
				zodiac = "Sagittarius";
			} else {
				if (day > 31) {
					System.out.println("Date Invalid");
					break;
				}
				zodiac = "Scorpio";
			}
			break;
		case 12:
			if (day >= 22) {
				zodiac = "Capricorn";
			} else {
				zodiac = "Sagittarius";
			}
			break;
		default:
			zodiac = "Invalid Date";
			break;
		}
		System.out.println("Your Zodiac sign is: " + zodiac);
		System.out.println();

		// 4. Number of Days in a Given Month and Year
		int year = 2024;
		int daysInMonth = (month == 2) ? (year % 4 == 0 ? 29 : 28)
				: ((month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31);
		System.out.println("Days in Month: " + daysInMonth);

		// 5. Arithmetic Operations
		int num1 = 10, num2 = 5, operation = 1; // 1: +, 2: -, 3: *, 4: /
		switch (operation) {
		case 1:
			System.out.println("Addition: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Subtraction: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication: " + (num1 * num2));
			break;
		case 4:
			System.out.println("Division: " + (num1 / num2));
			break;
		default:
			System.out.println("Invalid Operation");
		}
		System.out.println();
		// 6. Temperature Conversion
		double celsius = 25, fahrenheit;
		fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Celsius to Fahrenheit: " + fahrenheit);

		// 7. Area of Shapes
		int shape = 1; // 1: Circle, 2: Rectangle, 3: Triangle
		double radius = 5, length = 10, breadth = 5, base = 6, height = 4;
		switch (shape) {
		case 1:
			System.out.println("Circle Area: " + (3.14 * radius * radius));
			break;
		case 2:
			System.out.println("Rectangle Area: " + (length * breadth));
			break;
		case 3:
			System.out.println("Triangle Area: " + (0.5 * base * height));
			break;
		default:
			System.out.println("Invalid Shape");
		}
		System.out.println();

		// 8. Check if Number is Odd or Even
		int number = 7;
		System.out.println("Number " + number + " is " + (number % 2 == 0 ? "Even" : "Odd"));
		System.out.println();

		// 9. Currency Conversion (USD to INR)
		double usd = 10, inr = usd * 83;
		System.out.println("USD to INR: " + inr);
		System.out.println();

		// 10. Quadrilateral Type
		int side1 = 5, side2 = 5, side3 = 5, side4 = 5; // Square

		String quadType;

		if (side1 == side2 && side2 == side3 && side3 == side4) {
			quadType = "Square";
		} else if ((side1 == side3 && side2 == side4) && (side1 != side2)) {
			quadType = "Rectangle";
		} else {
			quadType = "Other";
		}

		System.out.println("Quadrilateral: " + quadType);
		System.out.println();
		// 11. Check Prime Number
		int primeCheck = 29, count = 0;
		for (int i = 2; i <= primeCheck / 2; i++)
			if (primeCheck % i == 0)
				count++;
		System.out.println(primeCheck + " is " + (count == 0 ? "Prime" : "Not Prime"));
		System.out.println();

		// 12. Perfect Square Check
		int squareCheck = 16;
		boolean isPerfectSquare = false;

		for (int i = 1; i * i <= squareCheck; i++) {
			if (i * i == squareCheck) {
				isPerfectSquare = true;
				break;
			}
		}

		if (isPerfectSquare) {
			System.out.println(squareCheck + " is a Perfect Square.");
		} else {
			System.out.println(squareCheck + " is Not a Perfect Square.");
		}
		// 13. Palindrome Number Check
		int palindrome = 121, reverse = 0, temp = palindrome;

		// Reverse the number
		while (temp > 0) {
			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp /= 10;
		}

		// Check if the original number is equal to the reverse
		if (palindrome == reverse) {
			System.out.println(palindrome + " is a Palindrome.");
		} else {
			System.out.println(palindrome + " is Not a Palindrome.");
		}
		System.out.println();
		// 14. Smallest of Three Numbers
		int n1 = 3, n2 = 5, n3 = 1;
		int smallest;

		// Check for the smallest number
		if (n1 <= n2 && n1 <= n3) {
			smallest = n1;
		} else if (n2 <= n1 && n2 <= n3) {
			smallest = n2;
		} else {
			smallest = n3;
		}

		System.out.println("Smallest Number: " + smallest);
		System.out.println();

		// 15. Armstrong Number Check
		int armstrong = 153, sum = 0, tempArm = armstrong;

		// Calculate the sum of cubes of digits
		while (tempArm > 0) {
			int digit = tempArm % 10;
			int cube = digit * digit * digit; // Cube without Math.pow
			sum += cube;
			tempArm /= 10;
		}

		// Check if the sum is equal to the original number
		if (sum == armstrong) {
			System.out.println(armstrong + " is an Armstrong number.");
		} else {
			System.out.println(armstrong + " is Not an Armstrong number.");
		}

		// 16. Sum of Digits
		int digitSum = 567, sumDigits = 0, tempSum = digitSum;
		while (tempSum > 0) {
			sumDigits += tempSum % 10;
			tempSum /= 10;
		}
		System.out.println("Sum of Digits: " + sumDigits);
		System.out.println();

		// 17. Check if Character is Alphabet
		char alphabetCheck = 'G';

		if ((alphabetCheck >= 'A' && alphabetCheck <= 'Z') || (alphabetCheck >= 'a' && alphabetCheck <= 'z')) {
			System.out.println(alphabetCheck + " is an Alphabet.");
		} else {
			System.out.println(alphabetCheck + " is Not an Alphabet.");
		}
		System.out.println();

		// 18. Perfect Number Check
		int perfectNum = 28, sumDiv = 0;

		// Loop to calculate the sum of divisors
		for (int i = 1; i < perfectNum; i++) {
			if (perfectNum % i == 0) {
				sumDiv += i;
			}
		}

		// Check if the sum of divisors equals the original number
		if (sumDiv == perfectNum) {
			System.out.println(perfectNum + " is a Perfect number.");
		} else {
			System.out.println(perfectNum + " is Not a Perfect number.");
		}
		System.out.println();

		// 19. Find Maximum & Minimum in Array
		int arr[] = { 2, 8, 3, 7, 1 };
		int max = arr[0], min = arr[0];
		for (int i : arr) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}
		System.out.println("Max: " + max + ", Min: " + min);
		System.out.println();
		// 20. Right-Angled Triangle Check
		int x = 3, y = 4, z = 5;

		if (x * x + y * y == z * z || y * y + z * z == x * x || z * z + x * x == y * y) {
			System.out.println("Right Angled Triangle can be Formed");
		} else
			System.out.println("Right Angled Triangle can not be Formed");
		System.out.println();
	}
}
