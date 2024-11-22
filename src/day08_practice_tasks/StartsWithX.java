package day08_practice_tasks;

import java.util.Scanner;

/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */
public class StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");

        String result = input.nextLine();

        replaceCh(result);

        input.close();

    }

    static void replaceCh(String input){

        if (input.toLowerCase().startsWith("x")){
            System.out.println("Output\n" + input.toLowerCase().replace('x','a'));
        }else{
            System.out.println(input);
        }

    }

}
