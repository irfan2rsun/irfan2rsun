package day11_practice_tasks;

public class Employee {
    String name;
    int age;
    char gender;
    String jobTitle;
    double salary;

    public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String work(){
        return jobTitle + " " + name + " is working.";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}' + "\n" +work();
    }

}
