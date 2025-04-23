package oops.polymorphism.assignment1;
/*
 * Overload a method area() to calculate:
    Area of a circle

    Area of a rectangle

    Area of a square
 */
public class Shape {
     // Method to calculate area of a circle
     public void area(double radius) {
        double area = 3.14 * radius * radius; // Using 3.14 as an approximation of Pi
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate area of a rectangle
    public void area(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate area of a square
    public void area(int side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(5.0);          // Area of circle with radius 5.0
        shape.area(4.0, 6.0);     // Area of rectangle with length 4.0 and width 6.0
        shape.area(4);          // Area of square with side 4
    }
}
