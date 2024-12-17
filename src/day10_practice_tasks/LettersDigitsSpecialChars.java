package day10_practice_tasks;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        // 1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
        String str = "Wooden Spoon123!";

        String letters = "",
                digits = "",
                specialChars = "";

        for (char eachChar : str.toCharArray()){
            if (Character.isLetter(eachChar)){
                letters += eachChar;
            } else if (Character.isDigit(eachChar)) {
                digits += eachChar;
            } else {
                specialChars += eachChar;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special chars = " + specialChars);

    }

}
