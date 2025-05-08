package oops.this_and_super;

class Parent {
    int num = 100;
}

class Child extends Parent {
    int num = 200;

    void showNumbers() {
        System.out.println("Child num: " + this.num);   // current class variable
        System.out.println("Parent num: " + super.num); // parent class variable
    }
}
