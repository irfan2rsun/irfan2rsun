package day11_practice_tasks;

public class LocalResturant {
    public static void main(String[] args) {
        Server[] servers = {
                new Server("Adam", 013, 24.5, true),
                new Server("Bob", 014, 24.5, true),
                new Server("Charlie", 015, 24.5, true),
                new Server("David", 016, 24.5, false),
                new Server("Edward", 017, 24.5, false)
        };

        Chef[] chefs = {new Chef("Frank", 02, 30, true),
                new Chef("George", 03, 30, true),
                new Chef("Henry", 04, 30, false),
        };

        Restaurant restaurant = new Restaurant("Irfan", "Irvine", 5);

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);


        System.out.println(restaurant);
        System.out.println(restaurant.servers);

        restaurant.hireServer(new Server("Mary", 30, 20, false));
        restaurant.hireChef(new Chef("Franky",35, 25, true));



        System.out.println(restaurant.servers);
        System.out.println(restaurant.chefs);
    }

}
