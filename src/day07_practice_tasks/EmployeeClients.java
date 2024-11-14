package day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee.name = "irfan tursun";
        Employee.jobTitle = "SDET";
        employee.age = 30;
        employee.salary = 100_000;
        employee.gender = 'M';


        System.out.println(employee);
        Employee.work();

        Employee employee1 = new Employee();
        Employee.name = "ironman";
        Employee.jobTitle = "avenger";
        employee1.age = 45;
        employee1.salary = 0;
        employee1.gender = 'M';
        System.out.println(employee1);
        Employee.work();

        Employee employee2 = new Employee();
        Employee.name = "thor";
        Employee.jobTitle = "avenger";
        employee1.age = 40;
        employee2.salary = 0;
        employee2.gender = 'M';
        System.out.println(employee2);
        Employee.work();

    }

}
