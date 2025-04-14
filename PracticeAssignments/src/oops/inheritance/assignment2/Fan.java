package oops.inheritance.assignment2;

import java.util.Scanner;

class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned on.");
    }
}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan f = new Fan();
        System.out.println("Press any key to turn on the fan:");
        sc.nextLine();

        f.turnOn();
        f.rotate();

        sc.close();
    }
}
