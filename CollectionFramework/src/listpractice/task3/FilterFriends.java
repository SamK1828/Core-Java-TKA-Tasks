package listpractice.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterFriends {
    public static int countVowels(String name) {
        int count = 0;
        for (char c : name.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();

        System.out.println("Enter names of 10 friends:");
        for (int i = 0; i < 10; i++) {
            friends.add(sc.nextLine());
        }

        for (String name : friends) {
            if ((name.toLowerCase().startsWith("s") || name.toLowerCase().startsWith("m")) && countVowels(name) >= 3) {
                System.out.println(name);
            }
        }
        sc.close();
        System.out.println("Names starting with 'S' or 'M' and having at least 3 vowels have been printed.");
    }
}
