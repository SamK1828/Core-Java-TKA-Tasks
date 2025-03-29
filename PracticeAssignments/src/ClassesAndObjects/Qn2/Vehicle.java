package ClassesAndObjects.Qn2;

public class Vehicle {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 2022, 30000);
        Car c2 = new Car("Honda", "Civic", 2021, 25000);
        Car c3 = new Car("Ford", "Mustang", 2020, 40000);
        Car c4 = new Car("Tesla", "Model 3", 2023, 45000);
        Car c5 = new Car("BMW", "X5", 2022, 60000);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
    }
}
