package oops.polymorphism.assignment1;

class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class DrawShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();   // Drawing shape

        Circle circle = new Circle();
        circle.draw();  // Drawing Circle

        Rectangle rectangle = new Rectangle();
        rectangle.draw(); // Drawing Rectangle

        Triangle triangle = new Triangle();
        triangle.draw(); // Drawing Triangle
    }
}
