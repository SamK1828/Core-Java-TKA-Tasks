package oops.inheritance.assignment3.student_and_employee;

import java.util.Scanner;

class Employee extends Person {
    String designation;

    void inputDetails(Scanner sc,Employee e) {
        
        e.input(sc);
        System.out.print("Enter designation: ");
        designation = sc.nextLine();
    }

    void showDetails(Employee e) {
        
        e.display();
        System.out.println("Designation: " + designation);
    }
}
