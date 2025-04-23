/*
 * Overload a method display() to:
Display a string

Display an integer

Display a string and an integer together
 */
package oops.polymorphism.assignment1;

public class Display {

    // Method to display string
    public void display(String s) {
        System.out.println("String: " + s);
    }

    // Method to display integer
    public void display(int num) {
        System.out.println("Integer: " + num);
    }

    // Method to display both string and integer
    public void display(String s, int num) {
        System.out.println("String: " + s + ", Integer: " + num);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.display("Hello World!");    // Display string
        display.display(10);                 // Display integer
        display.display("The number is", 20); // Display string and integer
    }
}

