package day13_practice_tasks.phone_tasks;

public class PhoneClients {
    //Create multiple objects representing different phones.
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("IPhone","16","XL",1_199,"White");
        System.out.println(iPhone);
        iPhone.faceTime("789-9898-7777");

        Samsung samsung = new Samsung("Samsung", "S9", "Light", 999, "Black");
        System.out.println(samsung);
        samsung.developMode();

        Nokia nokia = new Nokia("Nokia", "E9", "Mini", 799, "Blue");
        System.out.println(nokia);
        nokia.call("215-353-7595");
    }
}
