package listpractice.task4;

import java.util.ArrayList;

public class MixedList {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Teacher("Mrs. A"));
        list.add(new Student("John"));
        list.add(new Staff("Ravi"));
        list.add(new Staff("Sita"));
        list.add(new Student("Amit"));

        System.out.println("Staff Members:");
        for (Person p : list) {
            if (p instanceof Staff) {
                System.out.println(p.name);
            }
        }
    }
}
