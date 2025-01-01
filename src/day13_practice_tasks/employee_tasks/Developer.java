package day13_practice_tasks.employee_tasks;

public class Developer extends Employee {
    // Extra Variable:
    public String programmingLanguage;

    public Developer(String name, int age, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, employeeId, jobTitle, salary, companyName);
        this.programmingLanguage = programmingLanguage;
    }

    // work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
    public void work() {
        System.out.println("[" + jobTitle + "] [" + getName() + "] is coding in [" + programmingLanguage + "]");
    }
}
