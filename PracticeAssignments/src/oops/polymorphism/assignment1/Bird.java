package oops.polymorphism.assignment1;

// Show runtime polymorphism with Bird class and subclasses Sparrow, Eagle

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird b1 = new Sparrow(); // Runtime polymorphism
        Bird b2 = new Eagle(); // Runtime polymorphism

        b1.fly(); // Sparrow flies low and fast
        b2.fly(); // Eagle soars high in the sky
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flies low and fast");
    }
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky");
    }
}
// END public class Bird implements Flyable
