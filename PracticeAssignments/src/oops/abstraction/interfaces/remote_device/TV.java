package oops.abstraction.interfaces.remote_device;

public class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }
    public void turnOff() {
        System.out.println("TV is now OFF.");
    }
}
