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
        Samsung samsung = new Samsung("Samsung", "S9", 80, "Black", true, true);
        System.out.println(samsung);
        samsung.turnOn();
        samsung.turnOff();
        samsung.downloadApp();
        samsung.call(7147776363L);
        samsung.text(7147776367L);
        System.out.println("------------------------------------------------------");
        Google google = new Google("Google", "G3",599,"Gold",true,true);
        google.turnOn();
        google.turnOff();
        google.downloadApp();
        google.call(7147776363L);
        google.text(7147776367L);
        System.out.println("------------------------------------------------------");
        PersonalComputer personalComputer = new PersonalComputer("iBuyPower","M7",799,"Black&Red",true,true);
        System.out.println(personalComputer);
        personalComputer.turnOn();
        personalComputer.turnOff();
        System.out.println("------------------------------------------------------");
        Desktop desktop = new Desktop("Dell", "OptiPlex 7090", 899, "Black", false, true);
        System.out.println(desktop);
        desktop.turnOn();
        desktop.turnOff();
        System.out.println("------------------------------------------------------");
        LapTop laptop = new LapTop("ASUS", "ROG Zephyrus G14", 1499, "Eclipse Gray", true, false);
        laptop.turnOn();
        laptop.turnOff();
    }
}
