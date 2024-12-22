package day11_practice_tasks;

public class CydeoStudent {
    // Attributes:
    String name;
    int age;
    int id;
    int grade;
    String batchNumber;
    int groupNumber;
    static String schoolName = "Cydeo";
    static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, int id, int grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public String study() {
        return name + " " + "is studying";
    }

    public String attendClass() {
        return name + " " + "is attending the live class.";
    }

    public String printSchoolName() {
        return schoolName;
    }

    public String ProgLanguage() {
        return programmingLanguage;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}' + "\n" + study()
                + "\n" + attendClass()
                + "\n" + name + " is studying at " + printSchoolName() + " and learning " + ProgLanguage();

    }
}
