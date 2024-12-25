package day12_practice_tasks;

public class Item {
    // Attributes:
    // Ensure encapsulation for all fields.
    private String name;
    private double unitPrice;
    private int quantity;



    // Conditions:
    //    The name cannot be empty or blank.
    //    The name cannot contain any special characters other than space.
    //    The name must start with letters.
    public String getName() {
        if (name.isEmpty() || name.isBlank() || !name.matches("[a-zA-Z]+")) {
            System.err.println("Invalid input");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || !name.matches("[a-zA-Z]+")) {
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.name = name;
    }

    //    The unitPrice cannot be negative.
    public double getUnitPrice() {
        if (unitPrice < 0) {
            System.err.println("Unit price can not be negative");
            System.exit(1);
        }
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Unit price can not be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    //    The quantity cannot be negative.
    public int getQuantity() {
        if (quantity < 0) {
            System.err.println("Quantity can not be negative");
            System.exit(1);
        }
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Quantity can not be negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    // Add a constructor that enables the user to set all fields during object creation.
    public Item(String name, double unitPrice, int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    // Actions:
    // calcCost(): Returns the total cost.
    public double calcCost() {
        return unitPrice * quantity;
    }

    // toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.
    public String toString() {
        return "Item {" +
                "Name = " + getName() +
                ", Unit Price = $" + getUnitPrice() +
                ", Quantity = " + getQuantity() +
                ", Total Cost = $" + Math.round(calcCost()) + "}";
    }

}
