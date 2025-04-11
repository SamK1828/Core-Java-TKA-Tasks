package oops.inheritance.assignment1.marks_and_salary;
/*
 * Create a class Student with fields name, rollNo. Inherit a class Marks with fields subject1, subject2, and method to calculate total. 
 * Display all details using a Marks class object.
 */
import java.util.Scanner;
public class Marks extends Student {
    private int subject1;
    private int subject2;

    // Constructor chaining with super
    public Marks(String name, int rollNo, int subject1, int subject2) {
        super(name, rollNo);
        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    // Getters and Setters
    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    // Method to calculate total
    public int getTotal() {
        return subject1 + subject2;
    }

    // Method to calculate average
    public double getAverage() {
        return getTotal() / 2.0;
    }

    // Method to determine grade
    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }

    public void displayMarksheet() {
        displayStudentInfo();
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Total Marks: " + getTotal());
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Subject 1 Marks: ");
        int s1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int s2 = sc.nextInt();

        Marks student = new Marks(name, rollNo, s1, s2);
        System.out.println("\n----- Student Marksheet -----");
        student.displayMarksheet();

        sc.close();
    }
}

