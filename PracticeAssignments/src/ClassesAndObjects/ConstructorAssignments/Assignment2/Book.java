package ClassesAndObjects.ConstructorAssignments.Assignment2;

public class Book {
    int bookId;
    String title;
    String author;
    double price;
    int availableCopies;

    Book(int bookId, String title, String author, double price, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    void issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No copies available to issue.");
        }
    }

    void returnBook() {
        availableCopies++;
        System.out.println("Book returned successfully.");
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Price: " + price + ", Available Copies: " + availableCopies);
    }
}

class Main {
    public static void main(String[] args) {
        Book b = new Book(101, "Atomic Habits", "James Clear", 399.0, 2);
        b.displayBookDetails();
        b.issueBook();
        b.issueBook();
        b.issueBook(); // should show no copies available
        b.returnBook();
        b.displayBookDetails();
    }
}

