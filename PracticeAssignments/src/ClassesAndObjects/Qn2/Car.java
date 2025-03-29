package ClassesAndObjects.Qn2;

public class Car {
    String brand;
    String model;
    int year;
    double price;

    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: $" + price);
    }
}
