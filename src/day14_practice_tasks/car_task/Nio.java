package day14_practice_tasks.car_task;
// 9.2 Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
public class Nio extends Car implements AutoPark, AutoPilot{
    public Nio(String model, int year, int price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
