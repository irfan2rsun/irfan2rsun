package day14_practice_tasks.car_task;
// 10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String make, String model, int year, int price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " started by putting the mind into it");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " starts driving");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " is parking itself");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+ " is driving itself");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+ " is in fly mode");
    }
}
