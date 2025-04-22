package oops.abstraction.interfaces.remote_device;

public class FanRemote implements RemoteControl {
    public void turnOn() {
        System.out.println("Fan is running.");
    }
    public void turnOff() {
        System.out.println("Fan is stopped.");
    }
}
