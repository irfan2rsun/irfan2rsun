package day11_practice_tasks;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double totalCost = (width * length) * unitPrice;
        if (isPersian) {// Boolean default value is false and why
            return totalCost + 200;
        } else {
            return totalCost;
        }

    }

    @Override
    public String toString() {
        return "Your " + (isPersian ? "persian " : "") + "carpet that is " + width + " x " + length + " and a unit price of $" + unitPrice + " costs a total of $" + calcCost();
    }


}


