package day13_practice_tasks.employee_tasks;

public class Teacher extends Employee {
    public Teacher(String name, int age, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, employeeId, jobTitle, salary, companyName);
    }

    public void work() {
        System.out.println("[" + jobTitle + "] [" + getName() + "] is teaching");
    }
}
