package day12_practice_tasks;

public class CandyClients {
    public static void main(String[] args) {
        Candy candy1 = new Candy("YellowApple", 2, 0, false);
        System.out.println(candy1);

        Candy hershey = new Candy("Hershey",-1,0,true);
        System.out.println(hershey);

        hershey.setQuantity(100);
        hershey.setPrice(2);
        System.out.println(hershey);
    }
}
