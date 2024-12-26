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
        if (quantity <= 0) {
            System.err.println("The quantity of candy cannot be set to zero or a negative value.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("The price of candy cannot be set to a negative value.");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        if (hasPeanuts) {
            System.out.println("doesn't have peanuts");
        }
        System.out.println("contain peanuts");
        ;
    }

    // Add a constructor that allows the user to set all fields during object creation.
    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanuts = hasPeanuts;
    }

    // Actions:
    // toString():Displays the brand, unit price, and quantity when the object is printed.
    // If the price is zero,display "free" instead of 0.
    public String toString() {
        if (getPrice() == 0) {
        }

        return "Candy {" + "Brand = " + getBrand() + " Unit Price = " + getPrice() + " Quantity = " + getQuantity() + " Has peanuts = " + isHasPeanuts() + "}";

    }

}



