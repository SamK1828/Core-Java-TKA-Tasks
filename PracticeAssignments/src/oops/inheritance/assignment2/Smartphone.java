package oops.inheritance.assignment2;

import java.util.Scanner;

class Mobile {
    void call() {
        System.out.println("Making a call from mobile.");
    }
}

class Smartphone extends Mobile {
    void browseInternet() {
        System.out.println("Browsing internet on smartphone.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Smartphone sm = new Smartphone();
        System.out.println("Press any key to use smartphone:");
        sc.nextLine();

        sm.call();
        sm.browseInternet();

        sc.close();
    }
}
