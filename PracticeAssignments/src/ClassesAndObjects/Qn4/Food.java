package ClassesAndObjects.Qn4;

class Food {
    String itemName;
    String cuisine;
    double price;
    boolean isVeg;

    Food(String itemName, String cuisine, double price, boolean isVeg) {
        this.itemName = itemName;
        this.cuisine = cuisine;
        this.price = price;
        this.isVeg = isVeg;
    }

    void display() {
        System.out.println("Food: " + itemName + ", Cuisine: " + cuisine + ", Price: $" + price + ", Veg: " + (isVeg ? "Yes" : "No"));
    }
}
