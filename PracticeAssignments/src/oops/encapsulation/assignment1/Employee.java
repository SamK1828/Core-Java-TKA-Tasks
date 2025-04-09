package oops.encapsulation.assignment1;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    // Getter and Setter methods
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Operation: Calculate bonus
    public double calculateBonus() {
        return salary * 0.10;
    }

    // Operation: Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs." + salary);
        System.out.println("Bonus: Rs." + calculateBonus());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setEmpId(sc.nextInt());

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        System.out.println("\n--- Employee Details ---");
        emp.displayDetails();
        
        sc.close();
    }
}
