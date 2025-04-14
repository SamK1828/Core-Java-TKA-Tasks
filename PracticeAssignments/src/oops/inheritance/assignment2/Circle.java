package oops.inheritance.assignment2;

import java.util.Scanner;

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        c.setRadius(r);

        c.draw();
        c.area();

        sc.close();
    }
}
