package ClassesAndObjects.ConstructorAssignments.Assignment2;

public class Product {
    int productId;
    String productName;
    double price;
    int stock;

    Product(int productId, String productName, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    void purchaseProduct(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println("Purchased " + quantity + " units of " + productName);
        } else {
            System.out.println("Insufficient stock!");
        }
    }

    void addStock(int quantity) {
        stock += quantity;
        System.out.println("Added " + quantity + " units to stock.");
    }

    void displayProductDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: " + price + ", Stock: " + stock);
    }
}

class Main {
    public static void main(String[] args) {
        Product p = new Product(1, "Monitor", 150.0, 10);
        p.displayProductDetails();
        p.purchaseProduct(3);
        p.addStock(5);
        p.purchaseProduct(20);
        p.displayProductDetails();
    }
}

