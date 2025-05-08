package oops.this_and_super;

class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        super.display(); // calling parent method
        System.out.println("Class B");
    }
}
