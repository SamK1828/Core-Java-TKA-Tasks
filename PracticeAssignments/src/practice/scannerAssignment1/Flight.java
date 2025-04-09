package practice.scannerAssignment1;

import java.util.Scanner;

public class Flight {
    String flightNumber;
    String airline;
    String departureCity;
    String destinationCity;
    String departureTime;
    double ticketPrice;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Flight Number: ");
        flightNumber = sc.nextLine();

        System.out.print("Enter Airline Name: ");
        airline = sc.nextLine();

        System.out.print("Enter Departure City: ");
        departureCity = sc.nextLine();

        System.out.print("Enter Destination City: ");
        destinationCity = sc.nextLine();

        System.out.print("Enter Departure Time: ");
        departureTime = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        ticketPrice = sc.nextDouble();
        sc.close(); 
    }

    public void displayDetails() {
        System.out.println("\n--- Flight Details ---");
        System.out.println("Flight Number     : " + flightNumber);
        System.out.println("Airline           : " + airline);
        System.out.println("Departure City    : " + departureCity);
        System.out.println("Destination City  : " + destinationCity);
        System.out.println("Departure Time    : " + departureTime);
        System.out.println("Ticket Price      : " + ticketPrice);
    }

}
