package ClassesAndObjects.Qn1;

public class Animal {
    String name;
    String species;
    int age;
    double weight;

    Animal(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    void display() {
        System.out.println("Name: " + name + ", Species: " + species + ", Age: " + age + ", Weight: " + weight + " kg");
    }
}
