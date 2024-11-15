package day07_practice_tasks.scannerstasks;
/*
6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */
import java.util.Scanner;

public class Circle$formatdf {
    public static void main(String[] args) {

        int radius;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");

        radius = input.nextInt();

        System.out.println("The area of the Circle is " + (radius*radius)*3.14);
        System.out.println("The perimeter of the Circle is " + 2 * 3.14 * radius);

    }

}
