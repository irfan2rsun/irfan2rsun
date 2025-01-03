package day14_practice_tasks.car_task;

public class CarClients {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Supra","2JZ",1994,75_000, "White");
        System.out.println(toyota);

        Honda honda = new Honda("Civic","TypeR", 1993, 25_000, "Black");
        System.out.println(honda);

        BMW bmw = new BMW("E36", "TT", 1996, 25_999, "Blue");
        System.out.println(bmw);

        Audi audi = new Audi("R8","BZK",2024, 70_000, "Red");
        audi.autoPark();
        System.out.println(audi);

        Mercedes mercedes = new Mercedes("E63", "AMG", 2025, 99_999, "Silver");
        mercedes.autoPark();

        Tesla tesla = new Tesla("CyberTruck","MissileProve",2025,139_999,"Yellow");
        tesla.selfDrive();
        tesla.autoPark();
        System.out.println(tesla);

//        Nio nio = new Nio()
    }
}
