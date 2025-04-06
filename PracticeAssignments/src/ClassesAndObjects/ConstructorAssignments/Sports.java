package ClassesAndObjects.ConstructorAssignments;

public class Sports {
    String sportName, teamName, sportType, coachName, homeCity;
    int numPlayers, championshipsWon;

    // Constructor
    Sports(String sportName, String teamName, String sportType, String coachName, int numPlayers, String homeCity,
            int championshipsWon) {
        this.sportName = sportName;
        this.teamName = teamName;
        this.sportType = sportType;
        this.coachName = coachName;
        this.numPlayers = numPlayers;
        this.homeCity = homeCity;
        this.championshipsWon = championshipsWon;
    }

    // Display method
    void displayDetails() {
        System.out.println("Sport Name: " + sportName);
        System.out.println("Team Name: " + teamName);
        System.out.println("Sport Type: " + sportType);
        System.out.println("Coach Name: " + coachName);
        System.out.println("Number of Players: " + numPlayers);
        System.out.println("Home City: " + homeCity);
        System.out.println("Championships Won: " + championshipsWon);
        System.out.println("------------------------------");
    }
}

// Vehicle Class to create objects
class SportsMain  {
    public static void main(String[] args) {
        Sports sport1 = new Sports("Cricket", "Chennai Super Kings", "Outdoor", "MS Dhoni", 11, "Chennai", 5);
        Sports sport2 = new Sports("Football", "FC Barcelona", "Outdoor", "Xavi", 11, "Barcelona", 26);

        sport1.displayDetails();
        sport2.displayDetails();
    }
}

