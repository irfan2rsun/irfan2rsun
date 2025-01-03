package day14_practice_tasks.car_task;
// 8.2 Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
public class Mercedes extends Car implements AutoPark{
    public Mercedes(String make, String model, int year, int price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" is parking itself");
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
