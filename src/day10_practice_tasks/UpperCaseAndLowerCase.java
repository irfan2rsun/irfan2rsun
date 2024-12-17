package day10_practice_tasks;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        // 2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.
        String str = "JAVA a java";

        int countOfUpperCaseChars = 0,
                countOfLowerCaseChars = 0;

        for (char eachChar : str.toCharArray()) {
            if (Character.isUpperCase(eachChar)) {
                countOfUpperCaseChars++;
            } else if (Character.isLowerCase(eachChar)) {
                countOfLowerCaseChars++;
            }

        }

        System.out.println(countOfUpperCaseChars == countOfLowerCaseChars);

    }

}
