package oops.inheritance.assignment2;

import java.util.Scanner;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking.");
    }
}

class Human extends Mammal {
    void think() {
        System.out.println("Human is thinking.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human h = new Human();
        System.out.println("Press any key to perform actions:");
        sc.nextLine();

        h.eat();
        h.walk();
        h.think();

        sc.close();
    }
}

