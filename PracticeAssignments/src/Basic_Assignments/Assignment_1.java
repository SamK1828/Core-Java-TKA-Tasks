package Basic_Assignments;
import java.util.*;

public class Assignment_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Taking two numbers as input
		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = scanner.nextDouble();

		// Performing basic arithmetic operations
		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Subtraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));

		System.out.println("Division: " + (num1 / num2));
		System.out.println("Modulus: " + (num1 % num2));
		System.out.println();
		// Square and cube of a number
		System.out.print("Enter a number to find square and cube: ");
		double num = scanner.nextDouble();
		System.out.println("Square: " + (num * num));
		System.out.println("Cube: " + (num * num * num));
		System.out.println();
		// Area and perimeter of a rectangle
		System.out.print("Enter length of rectangle: ");
		double length = scanner.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double width = scanner.nextDouble();
		System.out.println("Area: " + (length * width));
		System.out.println("Perimeter: " + (2 * (length + width)));
		System.out.println();

		// Celsius to Fahrenheit conversion
		System.out.print("Enter temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Temperature in Fahrenheit: " + fahrenheit);
		System.out.println();

		// Comparing two numbers
		System.out.println("num1 == num2: " + (num1 == num2));
		System.out.println("num1 != num2: " + (num1 != num2));
		System.out.println("num1 > num2: " + (num1 > num2));
		System.out.println("num1 < num2: " + (num1 < num2));
		System.out.println("num1 >= num2: " + (num1 >= num2));
		System.out.println("num1 <= num2: " + (num1 <= num2));
		System.out.println();

		// Checking voting eligibility
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println(age >= 18 ? "You are eligible to vote." : "You are not eligible to vote.");
		System.out.println();

		// Finding the largest of two numbers
		System.out.println("Largest number: " + (num1 > num2 ? num1 : num2));

		// Checking if a number is greater than 100
		System.out.print("Enter a number: ");
		int checkNum = scanner.nextInt();
		System.out.println(checkNum > 100 ? "Number is greater than 100." : "Number is not greater than 100.");
		System.out.println();
		// Demonstrating assignment operators
		int x = 10;
		System.out.println("Initial value: " + x);
		x += 5;
		System.out.println("After += 5: " + x);
		x -= 3;
		System.out.println("After -= 3: " + x);
		x *= 2;
		System.out.println("After *= 2: " + x);
		x /= 4;
		System.out.println("After /= 4: " + x);
		x %= 3;
		System.out.println("After %= 3: " + x);
		System.out.println();
		scanner.close();
	}
}
