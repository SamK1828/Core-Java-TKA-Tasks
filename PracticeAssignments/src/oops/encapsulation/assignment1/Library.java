package oops.encapsulation.assignment1;

import java.util.Scanner;

public class Library {
    private int bookId;
    private String bookName;
    private String author;
    private int totalCopies;
    private int issuedCopies;

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getIssuedCopies() {
        return issuedCopies;
    }

    // Setters
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public void setIssuedCopies(int issuedCopies) {
        this.issuedCopies = issuedCopies;
    }

    // Display method
    public void displayBookDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Total Copies: " + totalCopies);
        System.out.println("Issued Copies: " + issuedCopies);
        System.out.println("Available Copies: " + (totalCopies - issuedCopies));
    }

    // Issue Book method
    public void issueBook() {
        if (issuedCopies < totalCopies) {
            issuedCopies++;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No available copies to issue.");
        }
    }

    // Return Book method
    public void returnBook() {
        if (issuedCopies > 0) {
            issuedCopies--;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("No books have been issued to return.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        System.out.print("Enter Book ID: ");
        lib.setBookId(sc.nextInt());
        sc.nextLine(); // Consume newline

        System.out.print("Enter Book Name: ");
        lib.setBookName(sc.nextLine());

        System.out.print("Enter Author Name: ");
        lib.setAuthor(sc.nextLine());

        System.out.print("Enter Total Number of Copies: ");
        lib.setTotalCopies(sc.nextInt());

        System.out.print("Enter Number of Issued Copies: ");
        lib.setIssuedCopies(sc.nextInt());

        lib.displayBookDetails();

        System.out.print("\nDo you want to issue a book? (y/n): ");
        sc.nextLine(); // Consume newline
        String issueChoice = sc.nextLine();
        if (issueChoice.equals("y")) {
            lib.issueBook();
        }

        System.out.print("Do you want to return a book? (y/n): ");
        String returnChoice = sc.nextLine();
        if (returnChoice.equals("y")) {
            lib.returnBook();
        }

        System.out.println("\nUpdated Details:");
        lib.displayBookDetails();

        sc.close();
    }
}
