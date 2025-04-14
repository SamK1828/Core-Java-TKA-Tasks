package oops.inheritance.assignment2;

import java.util.Scanner;

class Teacher {
    void teach() {
        System.out.println("Teacher is teaching.");
    }
}

class MathTeacher extends Teacher {
    void solveEquations() {
        System.out.println("Math Teacher is solving equations.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathTeacher mt = new MathTeacher();
        System.out.println("Press Enter to start the class:");
        sc.nextLine();

        mt.teach();
        mt.solveEquations();

        sc.close();
    }
}
