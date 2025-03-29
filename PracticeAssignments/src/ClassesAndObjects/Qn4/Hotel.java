package ClassesAndObjects.Qn4;

public class Hotel {
    public static void main(String[] args) {
        Food f1 = new Food("Pasta", "Italian", 12.5, true);
        Food f2 = new Food("Chicken Curry", "Indian", 15.0, false);
        Food f3 = new Food("Sushi", "Japanese", 18.0, false);
        Food f4 = new Food("Burger", "American", 10.0, false);
        Food f5 = new Food("Paneer Tikka", "Indian", 14.0, true);

        f1.display();
        f2.display();
        f3.display();
        f4.display();
        f5.display();
    }
}