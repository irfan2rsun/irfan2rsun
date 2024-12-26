package day12_practice_tasks;

public class Candy {
    // Attributes:
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    // Ensure encapsulation for all fields.
// Conditions: The price of candy cannot be set to a negative value.The quantity of candy cannot be set to zero or a negative value.
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    // Add a constructor that allows the user to set all fields during object creation.
    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity); // Using set here as there is a requirement for quantity and price
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }

    // Actions:
    // toString():Displays the brand, unit price, and quantity when the object is printed.
    // If the price is zero,display "free" instead of 0.
    public String toString() {


        return "Candy {" + "Brand = " + brand + ", Unit Price = " + (price == 0 ? "Free" : price) + ", Quantity = " + quantity + ", Has peanuts = " + hasPeanuts + "}";

    }

}



