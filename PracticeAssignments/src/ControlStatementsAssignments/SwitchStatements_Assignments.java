package ControlStatementsAssignments;

public class SwitchStatements_Assignments {
    public static void main(String[] args) {
        // 1. Traffic Light System
        String color = "Red"; // Predefined color
        System.out.print("Traffic Light (" + color + "): ");
        switch (color.toLowerCase()) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Slow Down"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid color!");
        }

        // 2. Recharge Plan Selection
        int plan = 2; // Predefined plan selection (1: Data Plan, 2: Talktime Plan, 3: SMS Pack)
        System.out.print("\nRecharge Plan (" + plan + "): ");
        switch (plan) {
            case 1: System.out.println("Data Plan: $10 for 5GB"); break;
            case 2: System.out.println("Talktime Plan: $5 for 100 minutes"); break;
            case 3: System.out.println("SMS Pack: $2 for 200 SMS"); break;
            default: System.out.println("Invalid plan!");
        }

        // 3. Train Fare Details
        int classType = 3; // Predefined class type (1: General, 2: Sleeper, 3: AC)
        System.out.print("\nTrain Class (" + classType + "): ");
        switch (classType) {
            case 1: System.out.println("General Class "); break;
            case 2: System.out.println("Sleeper Class "); break;
            case 3: System.out.println("AC Class "); break;
            default: System.out.println("Invalid class type! ");
        }

        // 4. Game Difficulty Level
        int difficulty = 1; // Predefined difficulty level (1: Easy, 2: Medium, 3: Hard)
        System.out.print("\nGame Difficulty (" + difficulty + "): ");
        switch (difficulty) {
            case 1: System.out.println("Easy Mode: Relax and enjoy!"); break;
            case 2: System.out.println("Medium Mode: Challenge yourself!"); break;
            case 3: System.out.println("Hard Mode: Prepare for a tough ride!"); break;
            default: System.out.println("Invalid difficulty level!");
        }

        // 5. Season Advisory
        int season = 3; // Predefined season (1: Summer, 2: Winter, 3: Rainy)
        System.out.print("\nSeason (" + season + "): ");
        switch (season) {
            case 1: System.out.println("Stay Hydrated!"); break;
            case 2: System.out.println("Wear Warm Clothes!"); break;
            case 3: System.out.println("Carry an Umbrella!"); break;
            default: System.out.println("Invalid season!");
        }

        // 6. Vehicle Type Based on Wheels
        int wheels = 4; // Predefined number of wheels (2, 3, 4, 6)
        System.out.print("\nVehicle Wheels (" + wheels + "): ");
        switch (wheels) {
            case 2: System.out.println("Bike"); break;
            case 3: System.out.println("Auto-Rickshaw"); break;
            case 4: System.out.println("Car"); break;
            case 6: System.out.println("Truck"); break;
            default: System.out.println("Invalid number of wheels!");
        }
    }

}
