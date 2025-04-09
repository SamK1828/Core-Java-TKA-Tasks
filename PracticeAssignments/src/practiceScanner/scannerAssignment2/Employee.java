package practiceScanner.scannerAssignment2;

import java.util.Scanner;

public class Employee {
    int id;
    String name;
    double basic, hra, da, netSalary;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();  // consume newline
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
        sc.close();
    }

    public void calculateSalary() {
        hra = 0.2 * basic;
        da = 0.1 * basic;
        netSalary = basic + hra + da;
    }

    public void printSlip() {
        System.out.println("\n--- Salary Slip ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic: ₹" + basic);
        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("Net Salary: ₹" + netSalary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getDetails();
        e.calculateSalary();
        e.printSlip();
    }
}

