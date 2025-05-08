package oops.this_and_super;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name; // using 'this' to distinguish instance variable from parameter
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
// This class demonstrates the use of 'this' keyword in Java
// to refer to the current object instance. The constructor initializes the instance variables