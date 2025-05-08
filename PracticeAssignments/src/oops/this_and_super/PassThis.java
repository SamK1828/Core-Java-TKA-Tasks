package oops.this_and_super;

public class PassThis {
    void display(PassThis obj) {
        System.out.println("Method called using object: " + obj);
    }

    void call() {
        display(this); // passing current object
    }
}
