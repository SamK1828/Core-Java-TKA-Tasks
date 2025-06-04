package listpractice.task1;

import java.util.ArrayList;

public class HighestPaidEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Samarth", "Pune", "Sam@mail.com", "Manager", 70000));
        employees.add(new Employee("Ranjay", "Mumbai", "Ranjay@mail.com", "Clerk", 50000));
        employees.add(new Employee("Nilesh", "Delhi", "Tinku@mail.com", "Director", 90000));
        employees.add(new Employee("Rohan", "Bangalore", "Rohan@mail.com", "Analyst", 60000));
        employees.add(new Employee("Suresh", "Chennai", "Suresh@mail.com", "Designer", 80000));
        employees.add(new Employee("Amit", "Hyderabad", "Amit@mail.com", "Developer", 75000));

        double max = 0;
        String highestPaid = "";
        for (Employee e : employees) {
            if (e.salary > max) {
                max = e.salary;
                highestPaid = e.name;
            }
        }
        System.out.println("Highest Paid Employee: " + highestPaid);
    }
}
