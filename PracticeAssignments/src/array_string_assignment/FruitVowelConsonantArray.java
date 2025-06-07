package array_string_assignment;
import java.util.Scanner;

public class FruitVowelConsonantArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String[] fruits = new String[5];
        char[] vowels = new char[100];
        char[] consonants = new char[100];
        int vIndex = 0, cIndex = 0;

        // Define vowels
        char[] vowelList = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Enter 5 fruit names:");
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.nextLine().toLowerCase().trim();
            for (char ch : fruits[i].toCharArray()) {
                // Check if character is in a-z
                if ((ch >= 'a' && ch <= 'z')) {
                    boolean isVowel = false;

                    // Check if ch is in vowelList
                    for (char v : vowelList) {
                        if (ch == v) {
                            isVowel = true;
                            break;
                        }
                    }

                    if (isVowel) {
                        vowels[vIndex++] = ch;
                    } else {
                        consonants[cIndex++] = ch;
                    }
                }
            }
        }

        // Print vowels
        System.out.print("Vowels: ");
        for (int i = 0; i < vIndex; i++) {
            System.out.print(vowels[i] + " ");
        }

        // Print consonants
        System.out.print("\nConsonants: ");
        for (int i = 0; i < cIndex; i++) {
            System.out.print(consonants[i] + " ");
        }

        sc.close();
    }
}