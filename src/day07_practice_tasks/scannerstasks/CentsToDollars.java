package day07_practice_tasks.scannerstasks;
/*
8. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents

1. Scanner that accept input
2. dollars = input
3.
 */

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents:");

        int cent = input.nextInt();

        System.out.println(cent + " cents is equal to " + cent / 100 + " dollars and " + cent % 100 + " cents");

        input.close();

    }

}
