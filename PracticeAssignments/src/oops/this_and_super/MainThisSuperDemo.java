package oops.this_and_super;

public class MainThisSuperDemo {
    public static void main(String[] args) {

        // 1. Student with this keyword
        Student s1 = new Student("Rahul", 20);
        s1.display();

        System.out.println("-----------------------------");

        // 2. Constructor chaining with this()
        ConstructorChain cc = new ConstructorChain();
        cc.toString();
        System.out.println("-----------------------------");

        // 3. Box using this for object reference
        Box b = new Box();
        b.setDimensions(2, 3, 4);
        System.out.println("Volume of box: " + b.calculateVolume());

        System.out.println("-----------------------------");

        // 4. super to call parent method
        B bObj = new B();
        bObj.display();

        System.out.println("-----------------------------");

        // 5. super() in constructor
        Dog dog = new Dog();
        dog.toString();
        System.out.println("-----------------------------");

        // 6. Overridden method with super.show()
        Manager m = new Manager();
        m.show();

        System.out.println("-----------------------------");

        // 7. Passing current object using this
        PassThis pt = new PassThis();
        pt.call();

        System.out.println("-----------------------------");

        // 8. Returning current object with this
        Product p = new Product(101);
        p.returnThis().display();  // method chaining

        System.out.println("-----------------------------");

        // 9. Calling super method from overridden method
        Circle c = new Circle();
        c.calculateArea();

        System.out.println("-----------------------------");

        // 10. this vs super variable access
        Child ch = new Child();
        ch.showNumbers();
    }
}
