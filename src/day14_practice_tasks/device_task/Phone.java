package day14_practice_tasks.device_task;
// 2. Create a Child Abstract Class of Device Named 'Phone':
public abstract class Phone extends Device{

    public Phone(String brand, String model, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, hasBattery, hasPowerButton);
    }

    // Extra Non-Abstract Methods:
    public void call(long phoneNum){
        System.out.println("Calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println("Texting " + phoneNum);
    }

    // toString():

}
