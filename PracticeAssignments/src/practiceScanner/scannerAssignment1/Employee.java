package practiceScanner.scannerAssignment1;

import java.util.Scanner;

public class Employee {
    int empId;
    String name;
    double salary;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.close();
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

}
