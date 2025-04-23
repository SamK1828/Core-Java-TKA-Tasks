/*
 * Create a superclass Animal with a method sound() and override it in:
 */
package oops.polymorphism.assignment1;

class Animal {
    // Method to make sound (will be overridden)
    public void sound() {
        System.out.println("Some animal sound");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Some animal sound

        Dog dog = new Dog();
        dog.sound();     // Bark

        Cat cat = new Cat();
        cat.sound();     // Meow
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
// Compare this snippet from PracticeAssignments/src/oops/abstraction/abstract_classes/animal_sounds/Animal.java:
// BEGIN public abstract class Animal
//     public abstract void makeSound();
//     public abstract void makeSound();
// END public abstract class Animal
// Compare this snippet from PracticeAssignments/src/oops/abstraction/abstract_classes/animal_sounds/Dog.java:
// BEGIN public class Dog extends Animal
//     @Override
//     public void makeSound()
//  {
//         System.out.println("Dog barks loudly when it sees strangers.");
//     }
//     @Override
//     public void makeSound()
//  {
//         System.out.println("Dog barks loudly when it sees strangers.");
//     }
// END public class Dog extends Animal
// Compare this snippet from PracticeAssignments/src/oops/abstraction/abstract_classes/animal_sounds/Cat.java:
// BEGIN public class Cat extends Animal
//     @Override
//     public void makeSound()
//  {
//         System.out.println("Cat meows and purrs when happy.");
//     }
//     @Override
//     public void makeSound()
//  {
//         System.out.println("Cat meows and purrs when happy.");
//     }


