package day13_practice_tasks.employee_tasks;

public class Tester extends Employee {

    public Tester(String name, int age, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, employeeId, jobTitle, salary, companyName);
    }

    // Tester:  work(): Displays "[jobTitle] [name] is testing".
    public void work() {
        System.out.println("[" + jobTitle + "] [" + getName() + "] is testing");
    }

}
