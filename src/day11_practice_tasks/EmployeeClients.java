package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee = new Employee("Yasin", 27, 'M', "SDET", 95_000);
        System.out.println(employee);

        Employee employee1 = new Employee("Adam", 31, 'M', "SDE", 100_000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Charlie", 25, 'M', "SDE", 110_000);
        System.out.println(employee2);
    }

}
