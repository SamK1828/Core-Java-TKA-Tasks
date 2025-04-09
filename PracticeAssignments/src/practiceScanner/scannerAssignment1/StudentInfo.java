package practiceScanner.scannerAssignment1;

import java.util.*;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String s = sc.nextLine();
		System.out.println("Enter Your Grade: ");
		String grade= sc.nextLine();
		System.out.println("Enter Your Roll No.: ");
		int roll = sc.nextInt();
		System.out.println("Enter Percentage: ");
		float percent=sc.nextFloat();
		System.out.println("Enter True if Fees Paid else enter False");
		boolean feesPaid = sc.nextBoolean();
		sc.close();
		
		Student st=new Student();
		st.showInfo(s, grade, roll,percent,feesPaid);
		
	}
}
