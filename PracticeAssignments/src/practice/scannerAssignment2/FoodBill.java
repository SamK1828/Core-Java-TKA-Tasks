package practice.scannerAssignment2;

import java.util.Scanner;

public class FoodBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of food items: ");
        int items = sc.nextInt();
        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();
        sc.close();
        double total = items * price;
        double gst = 0.05 * total;
        double payable = total + gst;

        System.out.println("\n--- Bill Receipt ---");
        System.out.println("Customer: " + name);
        System.out.println("Items: " + items);
        System.out.println("Total (before GST): ₹" + total);
        System.out.println("GST (5%): ₹" + gst);
        System.out.println("Total Payable: ₹" + payable);
        
    }
}

