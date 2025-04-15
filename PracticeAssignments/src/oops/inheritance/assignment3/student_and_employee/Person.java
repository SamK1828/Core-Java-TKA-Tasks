package oops.inheritance.assignment3.student_and_employee;

import java.util.Scanner;

class Person {
    String name;
    int age;

    public void input(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();  // consume newline
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



