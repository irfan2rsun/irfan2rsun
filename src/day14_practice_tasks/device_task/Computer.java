package day14_practice_tasks.device_task;
// 3. Create a Child Abstract Class of Device Named 'Computer':
public abstract class Computer extends Device{

    public Computer(String brand, String model, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, hasBattery, hasPowerButton);
    }

}
