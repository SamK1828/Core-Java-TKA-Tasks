package oops.inheritance.assignment2;

import java.util.Scanner;

class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    String designation;

    void displayEmployee() {
        System.out.println("Designation: " + designation);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();

        System.out.print("Enter Name: ");
        m.name = sc.nextLine();
        System.out.print("Enter Age: ");
        m.age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Designation: ");
        m.designation = sc.nextLine();
        System.out.print("Enter Department: ");
        m.department = sc.nextLine();

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();

        sc.close();
    }
}

