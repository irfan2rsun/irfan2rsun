package day13_practice_tasks.phone_tasks;

public class IPhone extends Phone {
    public IPhone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void faceTime(String phoneNumber) {
        System.out.println("face timing with the number [" + phoneNumber + "]");
    }

}
