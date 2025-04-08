package practice.scanner;



public class MainCallingClass {
     public static void main(String[] args) {
//	Table T = new Table();
//	T.printTable();
//	T.prime();
//	T.fibonacci();
    AtmWithdrawal.main(null);
    Product p = new Product();
    p.inputDetails();
    p.displayDetails();
    
    Employee e = new Employee();
    e.inputDetails();
    e.displayDetails();

    Book b = new Book();
    b.inputDetails();
    b.displayDetails();
    
    Movie m = new Movie();
    m.inputDetails();
    m.displayDetails();
    
    University u = new University();
    u.inputDetails();
    u.displayDetails();
    
    Sports s = new Sports();
    s.inputDetails();
    s.displayDetails();
    
    Flight flight1 = new Flight();
    Flight flight2 = new Flight();

    System.out.println("Enter details for Flight 1:");
    flight1.inputDetails();

    System.out.println("\nEnter details for Flight 2:");
    flight2.inputDetails();

    flight1.displayDetails();
    flight2.displayDetails();
}
}
