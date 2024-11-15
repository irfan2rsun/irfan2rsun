package day07_practice_tasks;

public class AddressClients$ {
    public static void main(String[] args) {

        Address address = new Address();
        address.buildingNumber = 7925;
        address.street = "Jones Branch Dr";
        address.city = "McLean";
        address.state = "VA";
        address.zipcode = "22012";

        System.out.println(address);

        System.out.println("-------------------------");

        Address address1 = new Address();
        address1.buildingNumber = 7927;
        address1.street = "XJK";
        address1.city = "XJK";
        address1.state = "XJk";
        address1.zipcode = "12345";

        System.out.println(address1);

        System.out.println("-------------------------");

        Address address2 = new Address();
        address2.buildingNumber = 7933;
        address2.street = "Urumqi";
        address2.city = "Urumqi";
        address2.state = "Urumqi";
        address2.zipcode = "830000";

    }


}
