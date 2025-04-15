package oops.inheritance.assignment3.student_and_employee;

import java.util.Scanner;

class Student extends Person {
    String course;

    void inputDetails(Scanner sc, Student s) {
        
        s.input(sc);
        System.out.print("Enter course: ");
        course = sc.nextLine();
    }

    void showDetails(Student s) {
        
        s.display();
        System.out.println("Course: " + course);
    }
}


