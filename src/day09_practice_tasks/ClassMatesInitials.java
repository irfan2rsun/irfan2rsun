package day09_practice_tasks;

public class ClassMatesInitials {
    public static void main(String[] args) {
        // 2.1 Create an array of strings named classmates.
        String[] classmates = new String[10];

        // 2.2 Store full names of 10 classmates.
        String[] names = {"Olivia Carter", "Ethan Montgomery", "Isabella Reid", "Noah Harrison", "Sophia Bennett", "Mason Walker", "Ava Thompson", "Liam Roberts", "Grace Patel", "Jacob Foster"};

        // 2.3 Print the initials of each student's name in separate lines.
        String[] initial = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String eachName = names[i];
            initial[i] = eachName.charAt(0) + "" + eachName.charAt(eachName.indexOf(" ") + 1);
            System.out.println(initial[i]);
        }

    }

}
