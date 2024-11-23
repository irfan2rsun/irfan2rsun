package day08_practice_tasks;

import java.util.Scanner;

/*
4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
 */
// Create two variables, firstName and lastName
// Email format is firstName_lastName@
// Replace first and last name if the email is separated by _ and show the given input if not
public class EmailTask1 {
    public static void main(String[] args) {

        String email = "miketyson@gmail.com";

        int underscore = email.indexOf('_');
        int atSign = email.indexOf('@');

        if (underscore > 0) {

            String firstName = email.substring(0, underscore);
            String lastName = email.substring(underscore + 1, atSign);
            System.out.println(lastName + "_" + firstName + email.substring(atSign));

        } else {
            System.out.println(email);
        }

    }


}


