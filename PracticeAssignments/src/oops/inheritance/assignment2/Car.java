package oops.inheritance.assignment2;

import java.util.Scanner;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

class FourWheeler extends Vehicle {
    void drive() {
        System.out.println("Driving a four-wheeler.");
    }
}

class Car extends FourWheeler {
    void musicSystem() {
        System.out.println("Playing music in the car.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();
        System.out.println("Press any key to start car functions:");
        sc.nextLine();

        c.move();
        c.drive();
        c.musicSystem();

        sc.close();
    }
}
