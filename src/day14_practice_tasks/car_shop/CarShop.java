package day14_practice_tasks.car_shop;

import day14_practice_tasks.car_task.Audi;
import day14_practice_tasks.car_task.Car;
import day14_practice_tasks.car_task.Honda;
import day14_practice_tasks.car_task.Tesla;

import java.util.ArrayList;


// 1. Create a Class Named 'CarShop':
public class CarShop {
    public static void main(String[] args) {
        // Given an array of Car objects:
        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue")
        };

        // 1.2. Display all cars eligible for recall:
        // - Honda: Years 2010 to 2011
        System.out.println("Eligible for recall:");
        for (Car car : cars) {
            if (car.getClass().getSimpleName().equals("Honda") && car.getYear() >= 2010 && car.getYear() <= 2011) {
                System.out.println(car);
            }
            if (car.getClass().getSimpleName().equals("Audi") && car.getYear() >= 2015 && car.getYear() <= 2019) {
                System.out.println(car);
            }
            if (car.getClass().getSimpleName().equals("Tesla") && car.getYear() >= 2015 && car.getYear() <= 2016) {
                System.out.println(car);
            }
            System.out.println("------------------------------");
            //  1.3. Display the car with the highest price.
            double highestPrice = cars[0 ].getPrice();
            Car highstPriceCar = null;
            for (Car each : cars) {
                if (car.getPrice()>highestPrice){
                    highestPrice = each.getPrice();
                    highstPriceCar = each;
                }
            }
            System.out.println("highstPriceCar = " + highstPriceCar);
            System.out.println("------------------------------");
            double lowestPrice = cars[0].getPrice();
            Car lowestPriceCar = null;
            for (Car low : cars) {
                if(low.getPrice()<lowestPrice){
                    lowestPrice = low.getPrice();
                    lowestPriceCar = low;
                }
            }
            System.out.println("lowestPriceCar = " + lowestPriceCar);

            // 1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
            ArrayList<Tesla> teslaCars = new ArrayList<>();

            for (Car each : cars) {
                if (each instanceof Tesla){
                    teslaCars.add((Tesla)each);
                }
            }
            System.out.println(teslaCars);
        }

    }

}


