package day13_practice_tasks.employee_tasks;

public class Person {
    // Attributes:
    private String name;
    private int age;

    // Add a constructor to initialize all fields.
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Encapsulation All the fields.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("null") || name.isEmpty()) {
            System.err.println("Name can not be set to null or empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Age can not be set to zero or negative");
            System.exit(1);
        }
        this.age = age;
    }

    // Actions:
    // eat(): Displays the person's name with the message " is eating"
    public void eat() {
        System.out.println(name + " is eating");
    }

    // sleep(): Displays the person's name with the message " is sleeping"
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    // toString(): Returns a string representation of the Person object.

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
