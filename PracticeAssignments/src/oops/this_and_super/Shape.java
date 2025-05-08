package oops.this_and_super;

class Shape {
    void calculateArea() {
        System.out.println("Calculating area in Shape");
    }
}

class Circle extends Shape {
    void calculateArea() {
        super.calculateArea(); // calling Shape method
        System.out.println("Calculating area in Circle");
    }
}
