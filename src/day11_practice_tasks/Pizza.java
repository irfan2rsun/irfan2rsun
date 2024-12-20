package day11_practice_tasks;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {
        double totalCost = (numberOfCheeseTopping * 2) + (numberOfPepperoniTopping * 2);
        return (size.equalsIgnoreCase("small") ? 10 + totalCost : size.equalsIgnoreCase("medium") ? 12 + totalCost : size.equalsIgnoreCase("large") ? 14 + totalCost : totalCost);
    }

    public String toString() {
        return "Your " + size + " pizza with " + numberOfCheeseTopping + " cheese topping and " + numberOfPepperoniTopping + " pepperoni topping is $" + calcCost();
    }

}
