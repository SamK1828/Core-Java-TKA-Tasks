package ClassesAndObjects.Qn3;

public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Department: " + department + ", Salary: $" + salary);
    }
}
