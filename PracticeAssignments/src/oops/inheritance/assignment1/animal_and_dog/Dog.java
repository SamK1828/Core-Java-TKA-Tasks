package oops.inheritance.assignment1.animal_and_dog;

public class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }


    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited method
        d.bark(); // Dog's own method
        d.sleep(); // inherited method
        d.makeSound(); // inherited method
        d.run(); // inherited method
        d.walk(); // inherited method

    }
}
