package practice.scannerAssignment1;

import java.util.Scanner;

public class Sports {
    String sportName;
    String teamName;
    String sportType;
    String coachName;
    int numPlayers;
    String homeCity;
    int championshipsWon;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sport Name: ");
        sportName = sc.nextLine();
        System.out.print("Enter Team Name: ");
        teamName = sc.nextLine();
        System.out.print("Enter Sport Type: ");
        sportType = sc.nextLine();
        System.out.print("Enter Coach Name: ");
        coachName = sc.nextLine();
        System.out.print("Enter Number of Players: ");
        numPlayers = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Home City: ");
        homeCity = sc.nextLine();
        System.out.print("Enter Championships Won: ");
        championshipsWon = sc.nextInt();
        sc.close();
    }

    public void displayDetails() {
        System.out.println("Sport Name: " + sportName);
        System.out.println("Team Name: " + teamName);
        System.out.println("Sport Type: " + sportType);
        System.out.println("Coach Name: " + coachName);
        System.out.println("Number of Players: " + numPlayers);
        System.out.println("Home City: " + homeCity);
        System.out.println("Championships Won: " + championshipsWon);
    }

}
