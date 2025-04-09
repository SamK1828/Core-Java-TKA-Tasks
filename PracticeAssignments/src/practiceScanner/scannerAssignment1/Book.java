package practiceScanner.scannerAssignment1;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.close();
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}
