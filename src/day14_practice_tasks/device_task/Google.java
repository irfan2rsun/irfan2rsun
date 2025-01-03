package day14_practice_tasks.device_task;
// - 'Google':
//        - Extends Phone class.
//        - Implements Downloadable & AndroidApps interfaces.
public class Google extends Phone implements Downloadable, AndroidApps{

    public Google(String brand, String model, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is off");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading App from " + AppStoreName );
    }
}
