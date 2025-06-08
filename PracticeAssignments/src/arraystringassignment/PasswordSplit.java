package arraystringassignment;

import java.util.Scanner;

public class PasswordSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        StringBuilder chars = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                chars.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                special.append(ch);
            }
        }

        System.out.println(chars + " is characters");
        System.out.println(special + " is special symbol");
        System.out.println(digits + " is an Integer");
        sc.close();
    }
}