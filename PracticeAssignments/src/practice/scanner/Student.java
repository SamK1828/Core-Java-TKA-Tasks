package practice.scanner;

public class Student {
	public void showInfo(String name, String grade, int roll, float percentage, boolean feesPaid) {
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Roll No. : " + roll);
		System.out.println("Percentage: " + percentage);
		System.out.println("Fees Paid: " + (feesPaid == true ? "Nill" : "Pending"));
	}
}
