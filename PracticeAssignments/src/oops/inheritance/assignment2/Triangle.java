package oops.inheritance.assignment2;

import java.util.Scanner;

class Shape {
    void showShape() {
        System.out.println("This is a shape.");
    }
}

class Polygon extends Shape {
    void showPolygon() {
        System.out.println("This is a polygon.");
    }
}

class Triangle extends Polygon {
    int base, height;

    void setTriangle(int b, int h) {
        base = b;
        height = h;
    }

    void showTriangle() {
        System.out.println("Triangle area: " + (0.5 * base * height));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        t.setTriangle(base, height);
        t.showShape();
        t.showPolygon();
        t.showTriangle();

        sc.close();
    }
}

