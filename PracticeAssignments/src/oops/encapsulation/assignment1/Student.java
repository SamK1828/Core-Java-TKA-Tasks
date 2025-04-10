package oops.encapsulation.assignment1;

import java.util.Scanner;

public class Student {
    private int rollNumber;
    private String name;
    private int[] marks = new int[3];

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    // Setters
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Method to calculate and display grade
    public void calculateGrade() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        float average = total / 3f;
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.print("Enter Roll Number: ");
        st.setRollNumber(sc.nextInt());
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        st.setName(sc.nextLine());

        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        st.setMarks(marks);

        st.displayDetails();
        st.calculateGrade();

        sc.close();
    }
}
