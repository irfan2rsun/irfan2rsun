package day13_practice_tasks.phone_tasks;

public class Samsung extends Phone{
    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void developMode(){
        System.out.println("opened developer settings");
    }

}
