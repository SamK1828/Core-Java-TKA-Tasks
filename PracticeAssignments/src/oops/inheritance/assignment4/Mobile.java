package oops.inheritance.assignment4;

import java.util.Scanner;

class Mobile {
    String brand;
    String model;

    public void call(Scanner sc) {
        System.out.print("Enter Mobile Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Model Name: ");
        model = sc.nextLine();
        System.out.println(" Calling from " + brand + " " + model + "...");
    }
}

class Smartphone extends Mobile {
    public void browseInternet() {
        System.out.println(" Opening web browser...");
        System.out.println(" Searching for: Java Inheritance Concepts");
        System.out.println(" Displaying search results...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Smartphone sp = new Smartphone();
        sp.call(sc);
        sp.browseInternet();
        sc.close();
    }
}

