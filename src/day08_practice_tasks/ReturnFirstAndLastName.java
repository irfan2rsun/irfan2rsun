package day08_practice_tasks;

import java.util.Scanner;

/*
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */
public class ReturnFirstAndLastName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input:\n\tfirstName = ");
        String firstName = input.nextLine();

        System.out.print("\tlastName = ");
        String lastName = input.nextLine();

        input.close();

        System.out.println("Output: " + EmailTask2.fixFormat(firstName) + " " + EmailTask2.fixFormat(lastName));

    }

}
