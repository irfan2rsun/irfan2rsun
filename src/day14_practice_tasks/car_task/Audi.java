package day14_practice_tasks.car_task;
// 8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
public class Audi extends Car implements AutoPark{
    public Audi( String model, int year, int price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel()+" is parking itself");
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
