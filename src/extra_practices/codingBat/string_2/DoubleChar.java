package extra_practices.codingBat.string_2;
/*
 Giving a string, return a string where for every char in the original, there are two chars

 doubleChar("The") -> "TThhee"
 doubleChar("AAbb") -> "AAAAbbbb"
 doubleChar("Hi-There") -> "HHii--TThheerree"
 */

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }

    public static String doubleChar(String str) {
        String result = ""; // Start with an empty string
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);// Get the character at index i
            result += c;// Add the character to the result
            result += c;// Add the character again to double it
        }
        return result;// Return the final string
    }

}

