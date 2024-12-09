package day09_practice_tasks;
public class StudentGrade {
    public static void main(String[] args) {
        // 4.1 Given two arrays with the same length:
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};

        // 4.2 Write a program to determine and store the students' grades in an array of characters named grades.
        char[] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {

            int eachScore = scores[i];
            char grade = 'F';

            if (eachScore >= 90) {
                grade = 'A';
            } else if (eachScore >= 80) {
                grade = 'B';
            } else if (eachScore >= 70) {
                grade = 'C';
            } else if (eachScore >= 60) {
                grade = 'D';
            }

                grades[i] = grade;

                // 2.3 Print the grade report for each student in separate lines.

                System.out.println(names[i] +"'s score is " + eachScore + " and grade is " + grade);

            }

        }

    }


