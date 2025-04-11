package oops.inheritance.assignment1.employee_and_salary;

public class Salary extends Employee {
    double basicPay, hra, da;

    void setSalaryDetails(double basic, double hra, double da) {
        this.basicPay = basic;
        this.hra = hra;
        this.da = da;
    }

    void calculateTotalSalary() {
        double total = basicPay + hra + da;
        displayEmployee();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + total);
    }

    public static void main(String[] args) {
        Salary sal = new Salary();
        sal.setEmployeeDetails(201, "Meera");
        sal.setSalaryDetails(30000, 5000, 3000);
        sal.calculateTotalSalary();
    }
}
