package oops.this_and_super;

class Employee {
    void show() {
        System.out.println("Employee show()");
    }
}

class Manager extends Employee {
    void show() {
        super.show(); // calling Employee's method
        System.out.println("Manager show()");
    }
}
