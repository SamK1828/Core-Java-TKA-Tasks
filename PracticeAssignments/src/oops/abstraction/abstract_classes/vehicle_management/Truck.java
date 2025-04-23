package oops.abstraction.abstract_classes.vehicle_management;

public class Truck extends Vehicle {
    @Override
    public void move() {
        System.out.println("Truck moves slowly with heavy load.");
    }
    
    public void loadCargo() {
        System.out.println("Loading cargo into the truck.");
    }
}
