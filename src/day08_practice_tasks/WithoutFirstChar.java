package day08_practice_tasks;
/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */

import java.util.Scanner;

// Ask the user to enter two word using the Scanner
// Create 2 variables firstWord and secondWord store them from user input
public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your two words: ");

        String firstWord = input.nextLine();
        String secondWord = input.nextLine();

        input.close();


        System.out.println(firstWord.substring(1) + secondWord.substring(1));

    }

}
