package day14_practice_tasks.car_task;

public class CarClients {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Supra",1994,75_000, "White");
        System.out.println(toyota);
        System.out.println("-----------------------------------------------------");
        Honda honda = new Honda("Civic", 1993, 25_000, "Black");
        System.out.println(honda);
        System.out.println("-----------------------------------------------------");
        BMW bmw = new BMW("E36", 1996, 25_999, "Blue");
        System.out.println(bmw);
        System.out.println("-----------------------------------------------------");
        Audi audi = new Audi("R8",2024, 70_000, "Red");
        audi.autoPark();
        System.out.println(audi);
        System.out.println("-----------------------------------------------------");
        Mercedes mercedes = new Mercedes("E63", 2025, 99_999, "Silver");
        mercedes.autoPark();
        System.out.println("-----------------------------------------------------");
        Tesla tesla = new Tesla("CyberTruck",2025,139_999,"Yellow");
        tesla.selfDrive();
        tesla.autoPark();
        System.out.println(tesla);
        System.out.println("-----------------------------------------------------");
        Nio nio = new Nio("SRT",2025,59_999,"purple");
        System.out.println(nio);
        nio.autoPark();
        nio.selfDrive();
//        Toyota prius = new Car("Prius","Hybird",2023,39_999,"White");
        boolean r1 = toyota instanceof Car;
        System.out.println(r1);
        System.out.println("-----------------------------------------------------");
        CydeoCar cydeoCar = new CydeoCar("CydeoCar",2050, 100_000,"Brown");
        System.out.println(cydeoCar);
        cydeoCar.fly();
        cydeoCar.drive();
        cydeoCar.selfDrive();
        cydeoCar.start();
        cydeoCar.autoPark();
    }
}
