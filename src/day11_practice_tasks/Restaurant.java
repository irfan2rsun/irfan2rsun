package day11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    // 	Attributes:
    String owner;
    String location;
    int numberOfStars;
    // (ArrayList of Server objects)
    ArrayList<Server> servers;
    // (ArrayList of Chef objects)
    ArrayList<Chef> chefs;

    // Add a constructor that sets the owner, location, and number of stars.
    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    //Actions:
    //		hireServer(Server server): adds a server object to the Servers ArrayList
    public void hireServer(Server server) {
        servers.add(server);
    }
    //		hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));// *
    }
    //		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
    public void hireChef(Chef chef) {
        chefs.add(chef);
    }
    //		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
    public void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs)); // *
    }
    //		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs ArrayList
    public void terminateChef(int id){
        chefs.removeIf(p->p.employeeID==id);
    }
    //		terminateServer(int employeeID): removes the server with the matching ID from the Servers ArrayList
    public void terminateServer(int id){
        chefs.removeIf(p->p.employeeID==id);
    }
    //		toString(): returns a string representation of the Restaurant object, including the number of Servers and Chefs alongside other information
    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
