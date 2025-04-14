package oops.inheritance.assignment2;

import java.util.Scanner;

class Device {
    void powerOn() {
        System.out.println("Device is powered on.");
    }
}

class Computer extends Device {
    void boot() {
        System.out.println("Computer is booting up...");
    }
}

class Laptop extends Computer {
    void carry() {
        System.out.println("Laptop is portable and easy to carry.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = new Laptop();
        System.out.println("Press Enter to power on the laptop...");
        sc.nextLine();

        laptop.powerOn();
        laptop.boot();
        laptop.carry();

        sc.close();
    }
}
