package ClassesAndObjects.ConstructorAssignments;

public class Flight {
    String flightNumber, airline, departureCity, destinationCity, departureTime;
    double ticketPrice;

    // Constructor
    Flight(String flightNumber, String airline, String departureCity, String destinationCity, String departureTime,
            double ticketPrice) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureTime = departureTime;
        this.ticketPrice = ticketPrice;
    }

    // Display method
    void displayDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Airline: " + airline);
        System.out.println("Departure City: " + departureCity);
        System.out.println("Destination City: " + destinationCity);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("------------------------------");
    }
}

// Main Class to create objects
class FlightMain {
    public static void main(String[] args) {
        Flight flight1 = new Flight("AI101", "Air India", "Delhi", "New York", "10:00 AM", 850.50);
        Flight flight2 = new Flight("EK502", "Emirates", "Dubai", "London", "3:00 PM", 750.75);

        flight1.displayDetails();
        flight2.displayDetails();
    }
}

