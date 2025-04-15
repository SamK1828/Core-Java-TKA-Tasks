package oops.encapsulation.assignment2.flight_management;

import java.util.Scanner;

public class FlightReception {
    String flightNumber;
    String airline;
    int capacity;
    float duration;
    float ticketRate;
    boolean isDomestic;
    char flightClass;

    FlightReception(Scanner sc) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Welcome to SKBranch Flight Management Portal\nEnter Flight Details to Proceed:");
        System.out.print("Enter Flight Number: ");
        flightNumber = sc.nextLine();
        System.out.print("Enter Airline Name: ");
        airline = sc.nextLine();
        System.out.print("Enter Capacity: ");
        capacity = sc.nextInt();
        System.out.print("Enter Flight Duration (in hours): ");
        duration = sc.nextFloat();
        System.out.print("Enter Ticket Rate: ");
        ticketRate = sc.nextFloat();
        System.out.print("Is the Flight Domestic? (true/false): ");
        isDomestic = sc.nextBoolean();
        System.out.print("Enter Flight Class (A/B/C): ");
        flightClass = sc.next().charAt(0);
        sc.nextLine(); // Clear buffer
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightReception f1 = new FlightReception(sc);
        Flight fl1 = new Flight(f1);
        FlightReception f2 = new FlightReception(sc);
        Flight fl2 = new Flight(f2);

        System.out.println("Ticket Rate after update: " + fl1.updateTicketRate(10));
        fl1.checkFlightType();

        System.out.println("Ticket Rate after update: " + fl2.updateTicketRate(20));
        fl2.checkFlightType();

        sc.close();
    }
}
