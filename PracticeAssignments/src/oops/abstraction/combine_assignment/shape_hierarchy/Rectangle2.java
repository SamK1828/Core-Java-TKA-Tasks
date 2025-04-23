package oops.abstraction.combine_assignment.shape_hierarchy;
import oops.abstraction.abstract_classes.shape_area_calculator.DrawShape;

public class Rectangle2 extends DrawShape {
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
    public double area() {
        return 10 * 5;
    }
    
    public void displayShape() {
        System.out.println("This is a rectangle.");
    }
    
    public double perimeter() {
        return 2 * (10 + 5);
    }
}
