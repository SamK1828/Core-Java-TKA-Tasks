package listpractice.task2;

import java.util.*;

public class ArrayListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add\n2. Remove\n3. Check\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    System.out.print("Enter item to add: ");
                    list.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    list.remove(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter item to check: ");
                    System.out.println(list.contains(sc.nextLine()) ? "Found" : "Not Found");
                    break;
                case 4:
                    System.out.println("List: " + list);
                    break;
                case 5:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }
}
