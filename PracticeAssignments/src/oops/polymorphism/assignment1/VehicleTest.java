/*
 * Create a class Vehicle with method move() and override it in:
 */
package oops.polymorphism.assignment1;


class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move(); // Vehicle is moving

        Car car = new Car();
        car.move();     // Car is moving

        Bike bike = new Bike();
        bike.move();    // Bike is moving
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}

// The code demonstrates method overriding in Java. 
//The Vehicle class has a method move(), which is overridden in the Car and Bike classes.

