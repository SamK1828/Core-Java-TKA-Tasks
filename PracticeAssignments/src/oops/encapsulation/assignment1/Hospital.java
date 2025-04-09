package oops.encapsulation.assignment1;

import java.util.Scanner;

public class Hospital {
    private String patientName;
    private int age;
    private String disease;
    private double billAmount;

    // Getters
    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public double getBillAmount() {
        return billAmount;
    }

    // Setters
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("\nPatient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Bill Amount: Rs." + billAmount);
    }

    // Method to apply discount
    public void applyDiscount() {
        if (billAmount > 10000) {
            double discount = billAmount * 0.1;
            billAmount -= discount;
            System.out.println("Discount Applied: ₹" + discount);
            System.out.println("Bill After Discount: ₹" + billAmount);
        } else {
            System.out.println("No discount applicable.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital patient = new Hospital();

        System.out.print("Enter Patient Name: ");
        patient.setPatientName(sc.nextLine());

        System.out.print("Enter Age: ");
        patient.setAge(sc.nextInt());
        sc.nextLine(); // Consume newline

        System.out.print("Enter Disease: ");
        patient.setDisease(sc.nextLine());

        System.out.print("Enter Bill Amount: ");
        patient.setBillAmount(sc.nextDouble());

        patient.displayDetails();
        patient.applyDiscount();
        sc.close();
    }
}
