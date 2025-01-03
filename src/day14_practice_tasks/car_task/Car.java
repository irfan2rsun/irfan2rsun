package day14_practice_tasks.car_task;
// 1. Create an Abstract Class Named 'Car':
public abstract class Car {
    // Variables
    private final String make;
    private final String model;
    private final int year;
    private int price;
    private String color;

    // Encapsulate all fields.

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.err.println("Price must not be less than 1886");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            System.err.println("make, model, color must not be null or empty.");
            System.exit(1);
        }
        this.color = color;
    }

    // Constructor: Initializes all fields.

    public Car(String make, String model, int year, int price, String color) {
        if (make == null || make.isEmpty() || model == null || model.isEmpty()) {
            System.err.println("make, model, color must not be null or empty.");
            System.exit(1);
        }
        if (year < 1886) {
            System.err.println("Year must not be less than 1886.");
            System.exit(1);
        }
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    // Abstract Methods:
    public abstract void start();

    public abstract void drive();

    // Non-Abstract Methods
    public void stop() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
