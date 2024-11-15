package day07_practice_tasks.scannerstasks;

import java.util.Scanner;

/*
11. Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
1. Scanner accept input
2. Print out the variables
 */
public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your gender:");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
        Long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state name:");
        String stateName = input.next();

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();

        input.close();

        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + phoneNumber + "\n" + "Address:\n\t" + buildingNumber + " " + streetName + "\n\t" + cityName + ", " + stateName + " " + zipCode);


    }
}
