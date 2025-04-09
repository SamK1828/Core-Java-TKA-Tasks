package practiceScanner.scannerAssignment1;

import java.util.Scanner;

public class University {
    String universityName;
    String location;
    int numStudents;
    int numProfessors;
    int ranking;
    int foundingYear;
    String department;
    String graduationLevel;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter University Name: ");
        universityName = sc.nextLine();
        System.out.print("Enter Location: ");
        location = sc.nextLine();
        System.out.print("Enter Number of Students: ");
        numStudents = sc.nextInt();
        System.out.print("Enter Number of Professors: ");
        numProfessors = sc.nextInt();
        System.out.print("Enter Ranking: ");
        ranking = sc.nextInt();
        System.out.print("Enter Founding Year: ");
        foundingYear = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Graduation Level: ");
        graduationLevel = sc.nextLine();
        sc.close();
    }

    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location);
        System.out.println("Number of Students: " + numStudents);
        System.out.println("Number of Professors: " + numProfessors);
        System.out.println("Ranking: " + ranking);
        System.out.println("Founding Year: " + foundingYear);
        System.out.println("Department: " + department);
        System.out.println("Graduation Level: " + graduationLevel);
    }

}
