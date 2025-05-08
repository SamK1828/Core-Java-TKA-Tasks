package oops.this_and_super;

public class Product {
    int id;

    Product(int id) {
        this.id = id;
    }

    Product returnThis() {
        return this;
    }

    void display() {
        System.out.println("Product ID: " + id);
    }
}
