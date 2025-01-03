package day14_practice_tasks.device_task;
// - 'PersonalComputer':
//        - Desktop
//        - Laptop
public class PersonalComputer extends Computer{

    public PersonalComputer(String brand, String model, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+ " is on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" is off");
    }

}
