package arraystringassignment;

import java.util.Scanner;
class Car {
    String name, color;
    float mileage;
    int price;

    Car(String name, String color, float mileage, int price) {
        this.name = name;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }
}

public class CarArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter details of Car " + (i + 1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Color: ");
            String color = sc.next();
            System.out.print("Mileage: ");
            float mileage = sc.nextFloat();
            System.out.print("Price: ");
            int price = sc.nextInt();
            cars[i] = new Car(name, color, mileage, price);
        }

        Car highestMileageCar = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].mileage > highestMileageCar.mileage) {
                highestMileageCar = cars[i];
            }
        }

        System.out.println("Car with highest mileage is: " + highestMileageCar.name);
        sc.close();
    }
}