package day13_practice_tasks.phone_tasks;

public class Phone {
    // Attributes:
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;
    // Encapsulation: All fields must be private with getters and setters.
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isBlank()||brand.isEmpty()||brand.equals("null")){
            System.err.println("The brand must not be null, empty, or blank.");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isBlank()||model.isEmpty()||model.equals("null")){
            System.err.println("The model must not be null, empty, or blank.");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank()||color.isEmpty()||color.equals("null")){
            System.err.println("The color must not be null, empty, or blank.");
            System.exit(1);
        }
        this.color = color;
    }

    // Constructor: Add a constructor to initialize all fields.
    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    // Actions: call(phoneNumber): Display "calling the number [phoneNumber]".
    public void call(String phoneNumber){
        System.out.println("calling the number [" + phoneNumber + "]");
    }

    // text(phoneNumber): Display "texting to the number [phoneNumber]".
    public void text(String phoneNumber){
        System.out.println("texting to the number [" + phoneNumber+ "]");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
