package ClassesAndObjects.Qn1;


public class Jungle {
    public static void main(String[] args) {
        Animal a1 = new Animal("Leo", "Lion", 5, 180.5);
        Animal a2 = new Animal("Jumbo", "Elephant", 10, 500.0);
        Animal a3 = new Animal("Stripes", "Tiger", 4, 150.0);
        Animal a4 = new Animal("Bingo", "Monkey", 2, 35.5);
        Animal a5 = new Animal("Rocky", "Bear", 6, 200.0);

        a1.display();
        a2.display();
        a3.display();
        a4.display();
        a5.display();
    }
}