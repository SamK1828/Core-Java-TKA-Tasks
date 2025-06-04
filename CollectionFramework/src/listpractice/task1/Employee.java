package listpractice.task1;

public class Employee {
    String name, address, email, desc;
    double salary;

    public Employee(String name, String address, String email, String desc, double salary) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.desc = desc;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", desc='" + desc + '\'' +
                ", salary=" + salary +
                '}';
    }
}
