package day13_practice_tasks.employee_tasks;

public class Driver extends Employee {

    public Driver(String name, int age, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, employeeId, jobTitle, salary, companyName);
    }

    // work(): Displays "[name] is driving".
    public void work() {
        System.out.println("[" + jobTitle + "] [" + getName() + "] is driving");
    }

}
