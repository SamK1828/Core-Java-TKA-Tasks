package oops.encapsulation.assignment2.hotel_management;

import java.util.Scanner;

public class HotelReception {
    int roomNumber;
    String roomType;
    float rentPerNight;
    boolean acAvailable;
    char roomGrade;
    double discount;
    HotelReception(Scanner sc){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Welcome to SKBranch Hotel Management Portal\n Enter Details to Proceed:");
        System.out.println("Enter Your Room Number:");
        roomNumber=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Room type");
        roomType=sc.nextLine();
        System.out.println("Enter Rent Per Night: ");
        rentPerNight=sc.nextFloat();
        System.out.println("Enter Ac Available or not: ");
        acAvailable=sc.nextBoolean();
        System.out.println("Enter Room Grade: ");
        roomGrade=sc.next().charAt(0);
        System.out.println("Enter Any Discount Applied to the Room or enter 0");
        discount=sc.nextDouble();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelReception h1 = new HotelReception(sc);
        HotelRoom hr1 = new HotelRoom(h1);
        HotelReception h2 = new HotelReception(sc);
        HotelRoom hr2 = new HotelRoom(h2);
        System.out.println("Rent After Applying Discount: "+hr1.getDiscountRent());
        System.out.println("Rent After Applying Discount: "+hr2.getDiscountRent());
        sc.close();

    }
}
