package day07_practice_tasks.scannerstasks;

import java.util.Scanner;

/*
9. Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
convert it to kilometers.

        Example:
             Enter the miles:
             Input: 10.0

        Output:
             10.0 miles is equal to 16.09 kilometers

1. Scanner
2. 1 mile is 1.60 kilometers
 */
public class MilesToKM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles:");

        double mile = input.nextDouble();

        System.out.println(mile + " miles is equal to " + (mile * 1.609) + " kilometers");

        input.close();

    }

}
