package oops.inheritance.assignment2;

import java.util.Scanner;

class Book {
    String title;

    void getTitle(String t) {
        title = t;
    }

    void showTitle() {
        System.out.println("Book Title: " + title);
    }
}

class Novel extends Book {
    String genre;

    void getGenre(String g) {
        genre = g;
    }

    void showGenre() {
        System.out.println("Genre: " + genre);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Novel n = new Novel();

        System.out.print("Enter Novel Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();

        n.getTitle(title);
        n.getGenre(genre);

        n.showTitle();
        n.showGenre();

        sc.close();
    }
}

