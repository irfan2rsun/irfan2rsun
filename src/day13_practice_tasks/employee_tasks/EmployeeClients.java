package day13_practice_tasks.employee_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Person person = new Person("Adam", 23);
        System.out.println(person);

        Employee employee = new Employee("Bob", 29, "1315177", "Manager", 95_000, "ABC");
        System.out.println(employee);
        employee.work();

        Tester tester = new Tester("Charlie", 23, "11357", "QA", 75_000, "CND");
        System.out.println(tester);
        tester.work();

        Developer developer = new Developer("David", 25, "1719119", "Developer", 100_000, "CMZ", "Java");
        System.out.println(developer);
        developer.sleep();
        developer.work();

        Teacher teacher = new Teacher("Elizabeth", 29, "1517199", "Math Teacher", 65_000, "IVC");
        System.out.println(teacher);
        teacher.work();

        Driver driver = new Driver("Frank", 45, "7531753", "Truck Driver", 100_000, "A2Z");
        System.out.println(driver);
        driver.work();

    }


}
