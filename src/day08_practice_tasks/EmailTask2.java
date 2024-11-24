package day08_practice_tasks;

import java.util.Scanner;

/*
5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */
public class EmailTask2 {// Why is this code giving me java.lang.StringIndexOutOfBoundsException: begin 0, end 95, length 25
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");

        String email = input.nextLine();



        int underscore = email.indexOf('_');
        int atSign = email.indexOf('@');
        int dot = email.indexOf('.');

        String firstName = email.substring(0, underscore); // Here is why as I put '_' instead of underscore
        String lastName = email.substring(underscore + 1, atSign);
        String domain = email.substring(atSign + 1, dot);

        System.out.println("First name: " + fixFormat(firstName));
        System.out.println("Last Name: " + fixFormat(lastName));
        System.out.println("Domain: " + domain);

        input.close();

    }

    public static String fixFormat(String str){

//        str = str.toLowerCase();
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();

    }

}
