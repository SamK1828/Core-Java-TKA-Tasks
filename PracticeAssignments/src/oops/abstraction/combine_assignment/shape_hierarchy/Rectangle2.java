package oops.abstraction.combine_assignment.shape_hierarchy;

import oops.abstraction.abstract_classes.shape_area_calculator.DrawRectangle;

public class Rectangle2 extends DrawRectangle {
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
    public double area() {
        return 10 * 5;
    }
}
