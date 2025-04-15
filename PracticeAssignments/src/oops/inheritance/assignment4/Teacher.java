package oops.inheritance.assignment4;

import java.util.Scanner;

class Teacher {
    String name, subject;

    public void teach(Scanner sc) {
        System.out.print("Enter Teacher Name: ");
        name = sc.nextLine();
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
    }

    public void displayTeachingInfo() {
        System.out.println(" " + name + " teaches " + subject);
    }
}

class MathTeacher extends Teacher {
    public void solveEquations() {
        System.out.println(" Solving Equation: x + 3 = 10");
        int result = 10 - 3;
        System.out.println(" Solution: x = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathTeacher mt = new MathTeacher();
        mt.teach(sc);
        mt.displayTeachingInfo();
        mt.solveEquations();
        sc.close();
    }
}
