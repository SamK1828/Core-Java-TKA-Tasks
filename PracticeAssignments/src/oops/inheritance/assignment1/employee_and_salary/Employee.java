package oops.inheritance.assignment1.employee_and_salary;
/*
 * Create a class Employee with empId, empName.
 *  Inherit a class Salary that includes basicPay, hra, and da. 
 * Calculate and print total salary.
 */
public class Employee {
    int empId;
    String empName;

    void setEmployeeDetails(int id, String name) {
        empId = id;
        empName = name;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

