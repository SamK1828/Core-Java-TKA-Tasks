package ClassesAndObjects.ConstructorAssignments;

public class Movie {
    String title, director, leadActor, leadActress, genre;
    int releaseYear, duration;
    double rating;

    // Constructor
    Movie(String title, String director, int releaseYear, String leadActor, String leadActress, int duration,
            String genre, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
    }

    // Display method
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Lead Actress: " + leadActress);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
        System.out.println("------------------------------");
    }
}

// Hotel Class to create objects
class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, "Leonardo DiCaprio", "Ellen Page", 148,
                "Sci-Fi", 8.8);
        Movie movie2 = new Movie("Titanic", "James Cameron", 1997, "Leonardo DiCaprio", "Kate Winslet", 195,
                "Romance", 7.8);

        movie1.displayDetails();
        movie2.displayDetails();
    }
}
