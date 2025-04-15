package oops.encapsulation.assignment2.hotel_management;

// import java.util.Scanner;
public class HotelRoom {
    private int roomNumber;
    private String roomType;
    private float rentPerNight;
    private boolean acAvailable;
    private char roomGrade;
    private double discount;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getRentPerNight() {
        return rentPerNight;
    }

    public void setRentPerNight(float rentPerNight) {
        this.rentPerNight = rentPerNight;
    }

    public boolean isAcAvailable() {
        return acAvailable;
    }

    public void setAcAvailable(boolean acAvailable) {
        this.acAvailable = acAvailable;
    }

    public char getRoomGrade() {
        return roomGrade;
    }

    public void setRoomGrade(char roomGrade) {
        this.roomGrade = roomGrade;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public HotelRoom(HotelReception h) {
        setRoomType(h.roomType);
        setRoomNumber(h.roomNumber);
        setRentPerNight(h.rentPerNight);
        setRoomGrade(h.roomGrade);
        setDiscount(h.discount);
        setAcAvailable(h.acAvailable);
    }

    public double getDiscountRent(){
        double discountPrice=(getDiscount()/100)*rentPerNight;
        return rentPerNight-discountPrice;
    }

}
