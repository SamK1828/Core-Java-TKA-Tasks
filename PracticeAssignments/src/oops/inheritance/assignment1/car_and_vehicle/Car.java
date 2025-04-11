package oops.inheritance.assignment1.car_and_vehicle;

public class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
    // Car class inherits from Vehicle class
    // It can use the methods defined in Vehicle class

    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // inherited from Vehicle
        car.drive(); // Car's own method
        car.accelerate(); // inherited from Vehicle
        car.brake(); // inherited from Vehicle
        car.honk(); // inherited from Vehicle
        car.stop(); // inherited from Vehicle
        
    }
}
