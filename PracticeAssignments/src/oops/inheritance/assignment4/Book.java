package oops.inheritance.assignment4;

import java.util.Scanner;

class Book {
    String title;

    public void getTitle(Scanner sc) {
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
    }

    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}

class Novel extends Book {
    String genre;

    public void getGenre(Scanner sc) {
        System.out.print("Enter Novel Genre: ");
        genre = sc.nextLine();
    }

    public void displayGenre() {
        System.out.println("Genre: " + genre);
    }

    public void showDetails() {
        displayTitle();
        displayGenre();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Novel novel = new Novel();
        novel.getTitle(sc);
        novel.getGenre(sc);
        System.out.println("\nNovel Details:");
        novel.showDetails();
        sc.close();
    }
}
