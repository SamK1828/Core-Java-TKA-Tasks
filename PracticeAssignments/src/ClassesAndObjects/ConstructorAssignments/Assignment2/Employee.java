package ClassesAndObjects.ConstructorAssignments.Assignment2;

public class Employee {
    int empId;
    String empName;
    String designation;
    double salary;

    Employee(int empId, String empName, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Designation: " + designation + ", Salary: " + salary);
    }

    void calculateBonus() {
        double bonus = (salary < 50000) ? salary * 0.10 : salary * 0.05;
        System.out.println("Bonus: " + bonus);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Rahul", "Developer", 45000);
        emp.displayDetails();
        emp.calculateBonus();
    }
}

