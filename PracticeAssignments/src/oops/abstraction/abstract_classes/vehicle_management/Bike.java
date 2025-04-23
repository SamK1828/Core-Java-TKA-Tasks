package oops.abstraction.abstract_classes.vehicle_management;

public class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike moves fast through traffic.");
    }
    
    public void displayType() {
        System.out.println("This is a bike.");
    }
}
