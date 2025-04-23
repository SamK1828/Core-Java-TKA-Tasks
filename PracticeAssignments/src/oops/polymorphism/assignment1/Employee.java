package oops.polymorphism.assignment1;

class Employee {
    public void calculateSalary() {
        System.out.println("Calculating generic employee salary");
    }

    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee(); // Polymorphic reference
        Employee e2 = new ContractEmployee(); // Polymorphic reference

        e1.calculateSalary(); // Permanent Employee Salary: Basic + DA + HRA
        e2.calculateSalary(); // Contract Employee Salary: Fixed monthly pay
    }
}

class PermanentEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Permanent Employee Salary: Basic + DA + HRA");
    }
}

class ContractEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Contract Employee Salary: Fixed monthly pay");
    }
}
