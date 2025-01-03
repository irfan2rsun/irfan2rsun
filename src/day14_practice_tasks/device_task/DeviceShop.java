package day14_practice_tasks.device_task;

// 9. Create a Class Named 'DeviceShop':
public class DeviceShop {
    public static void main(String[] args) {
        //- Instantiate an object from each concrete class.
        //    - Test all functions of each object.
        Iphone iPhone = new Iphone("Apple","16",1_119,"Blue",true,true);
        System.out.println(iPhone);
        boolean r1 = iPhone.isHasBattery();
        System.out.println(r1);
        boolean r2 = iPhone.isHasPowerButton();
        System.out.println(r2);
        iPhone.turnOn();
        iPhone.turnOff();
        iPhone.downloadApp();
        iPhone.call(7147776363L);
        iPhone.text(7147776367L);
        System.out.println("------------------------------------------------------");
    }
}
