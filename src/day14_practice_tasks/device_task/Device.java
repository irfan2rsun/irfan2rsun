package day14_practice_tasks.device_task;

// 1. Create an Abstract Class Named 'Device':
public abstract class Device {
    // Variables:
    private final String brand;
    private final String model;
    private int price;
    private String color;
    private boolean hasBattery;
    private boolean hasPowerButton;

    // Encapsulate all fields.
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    // Constructor: Initializes all fields.
    public Device(String brand, String model, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    // Abstract Methods:
    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", hasBattery=" + (hasBattery ? "has battery" : "no battery") +
                ", hasPowerButton=" + (hasPowerButton ? "has power button" : "no power button") +
                '}';
    }

}
