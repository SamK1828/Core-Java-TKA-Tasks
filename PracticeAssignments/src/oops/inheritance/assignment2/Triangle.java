package oops.inheritance.assignment2;

import java.util.Scanner;

class inShape {
    void showShape() {
        System.out.println("This is a shape.");
    }
}

class Polygon extends inShape {
    public void showPolygon() {
        System.out.println("This is a polygon.");
    }
}

public class Triangle extends Polygon {
    int base, height;

    public void setTriangle(int b, int h) {
        base = b;
        height = h;
    }

    public void showTriangle() {
        System.out.println("Triangle area: " + (0.5 * base * height));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t1 = new Triangle();

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        t1.setTriangle(base, height);
        t1.showShape();
        t1.showPolygon();
        t1.showTriangle();

        sc.close();
    }
}

