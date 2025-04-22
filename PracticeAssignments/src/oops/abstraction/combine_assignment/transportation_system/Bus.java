package oops.abstraction.combine_assignment.transportation_system;

public class Bus extends Transport {
    public void move() {
        System.out.println("Bus is moving on the highway.");
    }
    public int capacity() {
        return 50;
    }
}
