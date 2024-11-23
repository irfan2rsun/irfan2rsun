package day08_practice_tasks;

import java.util.Scanner;

/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */
// Using scanner to let the user enter two words.
// Concatenate them together
// if last-letter of the first word equal to the first letter of the second word show it only once
public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your two words:");

        String firstWord = input.next();
        String secondWord = input.next();

        input.close();

        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(secondWord.indexOf(0))){

            System.out.println(firstWord.substring(0,firstWord.length())+secondWord);

        }

    }

}
