package oops.inheritance.assignment3.student_and_employee;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nStudent Details:");
        Student s = new Student();
        s.inputDetails(sc,s);
        s.showDetails(s);
        System.out.println("\nEmployee Details:");
        Employee e = new Employee();
        e.inputDetails(sc,e);
        e.showDetails(e);

        sc.close();
    }
}
