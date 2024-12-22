package day11_practice_tasks;

public class Chef {
    // Attributes
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    // Add A constructor that can set all the fields.
    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    //Actions:
//    makeOrder(): prints chef's name + " is making an order"
    public void makeOrder() {
        System.out.println(name + " is making an order");
    }

    //    washDishes(): prints chef's name + " is washing the dishes"
    public void washDishes() {
        System.out.println(name + " is washing the dishes");
    }

//    toString(): returns a string representation of a Chef, including full-time or part-time status


    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                "," + (fullTime ? " full-time" : " part -time") +
                '}';
    }

}
