package oops.this_and_super;

class Animal {
    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calling Animal constructor
        System.out.println("Dog is created");
    }
}
