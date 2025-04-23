package oops.abstraction.abstract_classes.shape_area_calculator;

import oops.abstraction.interfaces.shape_drawing.Drawable;

public abstract class DrawShape implements Drawable {
    public abstract double area();
    public abstract void draw();
}
