package practiceScanner.scannerAssignment1;

import java.util.Scanner;

public class Movie {
    String movieName;
    String genre;
    double rating;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();
        System.out.print("Enter Genre: ");
        genre = sc.nextLine();
        System.out.print("Enter Rating: ");
        rating = sc.nextDouble();
        sc.close();
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }

}
