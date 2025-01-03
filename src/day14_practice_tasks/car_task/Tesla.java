package day14_practice_tasks.car_task;
// 9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
public class Tesla extends Car implements AutoPark,AutoPilot{
    public Tesla(String make, String model, int year, int price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" is parking itself");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" is driving itself");
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
