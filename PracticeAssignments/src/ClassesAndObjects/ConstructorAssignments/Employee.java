package ClassesAndObjects.ConstructorAssignments;

public class Employee {
    int empId, age, salary;
    String name, address, email, mob_no, gender, department;

    // Constructor
    Employee(int empId, String name, int age, String address, String email, String mob_no, String gender,
            String department, int salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.mob_no = mob_no;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    // Display method
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Mobile Number: " + mob_no);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("------------------------------");
    }
}

// StudentDetails Class to create objects
class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Samarth K", 30, "Hinjewadi,Pune", "john.doe@example.com", "9876543210", "Male",
                "HR", 50000);
        Employee emp2 = new Employee(102, "Shreyash K", 28, "Pimpri,Pune", "jane.smith@example.com", "8765432109",
                "Female", "IT", 60000);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
