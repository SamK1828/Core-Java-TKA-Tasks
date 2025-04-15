package oops.encapsulation.assignment2.flight_management;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private float duration;
    private float ticketRate;
    private boolean isDomestic;
    private char flightClass;

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public float getTicketRate() {
        return ticketRate;
    }

    public void setTicketRate(float ticketRate) {
        this.ticketRate = ticketRate;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    public char getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }

    // Constructor to receive data from FlightReception
    public Flight(FlightReception f) {
        setFlightNumber(f.flightNumber);
        setAirline(f.airline);
        setCapacity(f.capacity);
        setDuration(f.duration);
        setTicketRate(f.ticketRate);
        setDomestic(f.isDomestic);
        setFlightClass(f.flightClass);
    }

    // Method to update ticket rate (e.g., based on percentage discount or hike)
    public float updateTicketRate(float percentChange) {
        float updatedRate = ticketRate + (ticketRate * percentChange / 100);
        setTicketRate(updatedRate);
        return updatedRate;
    }

    // Method to check flight type
    public void checkFlightType() {
        if (isDomestic) {
            System.out.println("This is a Domestic Flight.");
        } else {
            System.out.println("This is an International Flight.");
        }
    }
}
