package day09_practice_tasks;

public class ClassMatesReversed {
    public static void main(String[] args) {
        // 6.1 Create an array of strings named classmates.
        String[] classmates;

        // 6.2 Store full names of 10 classmates.
        String[] fullNames = {"Olivia Carter", "Ethan Montgomery", "Isabella Reid", "Noah Harrison", "Sophia Bennett", "Mason Walker", "Ava Thompson", "Liam Roberts", "Grace Patel", "Jacob Foster"};

        // 6.3 Reverse each student's name and print them on separate lines.
        String reversedName = "";
        for (int i = fullNames.length - 1; i >= 0; i--) {
            reversedName = fullNames[i];
            System.out.println(reversedName);
        }

    }

}
