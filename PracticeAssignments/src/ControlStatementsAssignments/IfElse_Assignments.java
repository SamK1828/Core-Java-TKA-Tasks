package ControlStatementsAssignments;
public class IfElse_Assignments {
	public static void main(String[] args) {
		// Voting Machine
		System.out.println("Voting Machine");
		int age = 21;
		if (age >= 18) {
			System.out.println("Given Age Candidate is eligible to Vote");
		} else {
			System.out.println("Given Age Candidate is not eligible to vote ");
		}

		// Number Positive or Negative
		System.out.println("Positive or Negative Number:");
		int num = 55;
		if (num > 0) {
			System.out.println(num + "is Positive");
		} else if (num < 0) {
			System.out.println(num + "is Negative");
		} else {
			System.out.println(num + "is zero");
		}

		// Vowels or Consonants

		char c = 'a';
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			System.out.println("Vowels");
		} else {
			System.out.println("Consonant");
		}

		// valid number
		int a = 20;
		if (a < 20)
			System.out.println("num is valid");
		else
			System.out.println("Not valid");

		// 1. Assign Grades Based on Marks
		int marks = 85;
		System.out.print("Grade: ");
		if (marks >= 90)
			System.out.println("A");
		else if (marks >= 80)
			System.out.println("B");
		else if (marks >= 70)
			System.out.println("C");
		else if (marks >= 60)
			System.out.println("D");
		else
			System.out.println("Fail");

		// 2. Check Leap Year
		int year = 2024;
		System.out.println(year + " is "
				+ ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "a Leap Year" : "not a Leap Year"));

		// 3. Classify Age Group
//		        int age = 25;
		if (age <= 12)
			System.out.println("Child");
		else if (age <= 19)
			System.out.println("Teenager");
		else if (age <= 59)
			System.out.println("Adult");
		else
			System.out.println("Senior Citizen");

		// 4. Determine Triangle Type
		int b = 5;
		if (a == b && b == c)
			System.out.println("Equilateral Triangle");
		else if (a == b || b == c || a == c)
			System.out.println("Isosceles Triangle");
		else
			System.out.println("Scalene Triangle");

		// 5. Scholarship Eligibility
		double familyIncome = 40000;
		if (marks >= 85 && familyIncome <= 50000)
			System.out.println("Eligible for Scholarship");
		else
			System.out.println("Not Eligible for Scholarship");

		// 6. Find Largest of Three Numbers
		int x = 15, y = 30, z = 25;
		int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("Largest number: " + largest);

		// 7. Character Type Check
		char ch = 'A';
		if ("AEIOU".indexOf(ch) != -1)
			System.out.println("Uppercase Vowel");
		else if ("aeiou".indexOf(ch) != -1)
			System.out.println("Lowercase Vowel");
		else if (Character.isUpperCase(ch))
			System.out.println("Uppercase Consonant");
		else
			System.out.println("Lowercase Consonant");

		// 8. Divisibility Check by 5 and 11 
		System.out.println(num + " is "
				+ ((num % 5 == 0 && num % 11 == 0) ? "divisible by both 5 and 11" : "not divisible by both 5 and 11"));

		// 9. Marriage Eligibility Check
		String gender = "Male";
		int marriageAge = 22;
		if ((gender.equalsIgnoreCase("Male") && marriageAge > 21)
				|| (gender.equalsIgnoreCase("Female") && marriageAge > 18)) {
			System.out.println("Eligible for marriage");
		} else {
			System.out.println("Not eligible for marriage");
		}
	}

}
