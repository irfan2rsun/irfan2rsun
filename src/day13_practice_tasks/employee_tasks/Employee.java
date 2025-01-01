package day13_practice_tasks.employee_tasks;

public class Employee extends Person {
    // Attributes:
    String employeeId;
    String jobTitle;
    double salary;
    String companyName;

    // Encapsulation All the fields.

    // Add a constructor to initialize all fields.
    public Employee(String name, int age, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age);
        setName(name);
        setAge(age);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Salary can not be zero orn negative");
            System.exit(0);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Methods:
    // work(): Displays the employee's job title and name.
    public void work() {
        System.out.println("Job title: " + jobTitle + "\nName: " + getName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name=" + getName() +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
