package practiceScanner.scannerAssignment2;

import java.util.Scanner;

public class  Book{
    String title, author;
    double price;

    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Book b = new Book(title, author, price);
        b.display();
        sc.close();
    }
}

