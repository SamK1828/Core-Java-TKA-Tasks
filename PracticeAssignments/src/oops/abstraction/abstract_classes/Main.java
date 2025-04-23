package oops.abstraction.abstract_classes;

import oops.abstraction.abstract_classes.animal_sounds.*;
import oops.abstraction.abstract_classes.applicane_power_use.*;
import oops.abstraction.abstract_classes.person_details.*;
import oops.abstraction.abstract_classes.shape_area_calculator.*;
import oops.abstraction.abstract_classes.vehicle_management.*;

public class Main {
    public static void main(String[] args) {
        // Animal Sounds
        Animal animal = new Dog();
        animal.makeSound();

        // Appliance Power Use
        Appliance appliance = new Fan();
        appliance.powerConsumption();

        // Person Details
        Person person = new Student();
        person.displayDetails();

        DrawShape shape = new Rectangle(5.0, 3.0);
        System.out.println("Area of Rectangle: " + shape.area());
        shape.draw();
        System.out.println(shape.toString());
        // Vehicle Management
        Vehicle vehicle = new Bike();
        vehicle.move();
        vehicle.displayType();
        vehicle.move();
    }
}
