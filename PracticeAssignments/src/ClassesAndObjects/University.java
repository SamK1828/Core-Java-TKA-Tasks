package ClassesAndObjects;

public class University {
    String universityName, location, department, graduationLevel;
    int numStudents, numProfessors, ranking, foundingYear;

    // Constructor
    University(String universityName, String location, int numStudents, int numProfessors, int ranking,
            int foundingYear, String department, String graduationLevel) {
        this.universityName = universityName;
        this.location = location;
        this.numStudents = numStudents;
        this.numProfessors = numProfessors;
        this.ranking = ranking;
        this.foundingYear = foundingYear;
        this.department = department;
        this.graduationLevel = graduationLevel;
    }

    // Display method
    void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location);
        System.out.println("Number of Students: " + numStudents);
        System.out.println("Number of Professors: " + numProfessors);
        System.out.println("Ranking: " + ranking);
        System.out.println("Founding Year: " + foundingYear);
        System.out.println("Department: " + department);
        System.out.println("Graduation Level: " + graduationLevel);
        System.out.println("------------------------------");
    }
}
class Main{
    public static void main(String[] args) {
        // Creating objects of University class
        University uni1 = new University("DBATU University", "Lonere, Raigad", 20000, 2000, 1, 1636, "Engineering",
                "Undergraduate");
        University uni2 = new University("MGM University", "Chh.Sambhajinagar, Maharashtra", 17000, 1500, 2, 1885, "MBA",
                "Graduate");
        University uni3 = new University("Manjara University", "Latur, Maharashtra", 11000, 1000, 3, 1861, "Science", "PhD");

        // Displaying details of each university
        uni1.displayDetails();
        uni2.displayDetails();
        uni3.displayDetails();
    }
}



