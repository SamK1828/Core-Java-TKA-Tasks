package practice.scannerAssignment2;

import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        String grade;
        if (avg >= 75) grade = "A";
        else if (avg >= 60) grade = "B";
        else if (avg >= 40) grade = "C";
        else grade = "Fail";

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}

