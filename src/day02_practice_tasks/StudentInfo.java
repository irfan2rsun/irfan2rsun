package day02_practice_tasks;

public class StudentInfo {

    public static void main(String[] args) {

        String studentName = "Josh Steven", gender = "Male", schoolName = "MIT", gradeLevel = "Undergraduate", studentId = "A125";

        int age = 22;

        double gpa = 2.8;

        System.out.println("The student's name is " + studentName +
                "\nGender is " + gender +
                "\nAge is " + age +
                " years old" +
                "\nThe school's name is " + schoolName +
                "\nGrade level is " + gradeLevel +
                "\n" + studentName + "'s GPA is " + gpa);

    }

}

/*
3. Create a class named StudentInfo and write a program with the following requirements:

	Declare the following variables with appropriate data types:
			studentName
			age
			gender
			schoolName
			studentId
			gradeLevel
			gpa

	Display the full student information in the following format:

			Example:
				studentName = "Josh Steven";
				age = 22;
				gender = "Male";
				gpa = 2.8;
				schoolName = "MIT";
				gradeLevel = "Undergraduate";
				studentId = "A125";

			Output:
				The student's name is Josh Steven
				Gender is Male
				Age is 22 years old
				The school's name is MIT
				Grade level is Undergraduate
				Josh Steven's GPA is 2.8

 */