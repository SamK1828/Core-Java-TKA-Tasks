package practice.scanner;

import java.util.Scanner;

public class Product {
	  int productId;
	    String productName;
	    double price;

	    public void inputDetails() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Product ID: ");
	        productId = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Product Name: ");
	        productName = sc.nextLine();
	        System.out.print("Enter Price: ");
	        price = sc.nextDouble();
			sc.close();
	    }

	    public void displayDetails() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	    }

}
