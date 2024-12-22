package day11_practice_tasks;

public class Server {
    // Attributes:
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    // Add A constructor that can set all the fields.
    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    // Actions:
    // takeOrder(): server's name + "is taking an order"
    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    //	    cleanTable(): server's name + "is cleaning the table"
    public void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }
    //		toString(): returns a string representation of a Chef, including full-time or part-time status

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                "," + (fullTime ? " full-time" : " part-time") +
                '}';
    }
}
