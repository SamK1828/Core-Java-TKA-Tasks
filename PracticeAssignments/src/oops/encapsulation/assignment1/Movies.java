package oops.encapsulation.assignment1;

import java.util.Scanner;

public class Movies {
    private String title;
    private String director;
    private int releaseYear;
    private double rating;

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Method to display movie details
    public void displayDetails() {
        System.out.println("\nMovie Details:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating + "/10");
    }

    // Method to check if the movie is a hit based on rating
    public void isHit() {
        if (rating >= 8.0) {
            System.out.println("This movie is a HIT!");
        } else {
            System.out.println("This movie is AVERAGE.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movies movie = new Movies();

        System.out.print("Enter Movie Title: ");
        movie.setTitle(sc.nextLine());

        System.out.print("Enter Director Name: ");
        movie.setDirector(sc.nextLine());

        System.out.print("Enter Release Year: ");
        movie.setReleaseYear(sc.nextInt());

        System.out.print("Enter Movie Rating out of 10: ");
        movie.setRating(sc.nextDouble());

        movie.displayDetails();
        movie.isHit();
        sc.close();
    }
}

