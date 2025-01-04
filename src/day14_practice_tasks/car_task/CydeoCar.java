package day14_practice_tasks.car_task;
// 10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String model, int year, int price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getModel()+ " started by putting the mind into it");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+ " starts driving");
    }

    @Override
    public void autoPark() {
        System.out.println(getModel()+ " is parking itself");
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel()+ " is driving itself");
    }

    @Override
    public void fly() {
        System.out.println(getModel()+ " is in fly mode");
    }
}
