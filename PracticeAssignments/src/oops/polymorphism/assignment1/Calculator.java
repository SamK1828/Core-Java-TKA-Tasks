/*
 * Create a Calculator class with overloaded add() methods:
 */
package oops.polymorphism.assignment1;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(5, 10));            // Integer addition
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));         // Double addition
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));      // Three integers addition
    }
}

