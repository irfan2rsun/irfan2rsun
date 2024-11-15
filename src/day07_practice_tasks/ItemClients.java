package day07_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item = new Item();
        item.itemName = "NitroColdBrew";
        item.unitPrice = 6.50;
        item.quantity = 3;

        System.out.println(item);

        Item.calCost(item.unitPrice, item.quantity);

        System.out.println("-------------------------");

        Item item1 = new Item();
        item1.itemName = "Water";
        item1.unitPrice = 1;
        item1.quantity = 10;

        System.out.println(item1);

        Item.calCost(item1.unitPrice, item1.quantity);

        System.out.println("-------------------------");

        Item item2 = new Item();
        item2.itemName = "Samosa";
        item2.unitPrice = 2.99;
        item2.quantity = 9;

        System.out.println(item2);

        Item.calCost(item2.unitPrice, item2.quantity);

    }

}
