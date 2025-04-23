/*
 * Write a program to overload a constructor in a Student class:
 */
package oops.polymorphism.assignment1;
public class Student {

    private int rollNumber;
    private String name;

    // Constructor 1: No arguments
    public Student() {
        this.rollNumber = 0;
        this.name = "Unknown";
    }

    // Constructor 2: Takes roll number
    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = "Unknown";
    }

    // Constructor 3: Takes roll number and name
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(101);
        Student student3 = new Student(102, "John Doe");

        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}

