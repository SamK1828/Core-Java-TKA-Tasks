package oops.this_and_super;

public class ConstructorChain {
    int x, y;

    ConstructorChain() {
        this(10);
        System.out.println("No-arg constructor");
    }

    ConstructorChain(int x) {
        this(x,20);
        System.out.println("One-arg constructor");
    }

    ConstructorChain(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Two-arg constructor");
    }
}
