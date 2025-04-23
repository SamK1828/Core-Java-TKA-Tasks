package oops.abstraction.abstract_classes.animal_sounds;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks loudly when it sees strangers.");
    }
}
