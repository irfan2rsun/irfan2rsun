package day08_practice_tasks;

import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)");
        String yesOrNo = input.next();

        System.out.println("Enter the number of people: ");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount: ");
        double checkAmount = input.nextDouble();

        input.nextLine();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.nextLine().toLowerCase();

        input.close();

        double tip = switch (serviceQuality) {
            case "excellent" -> .25;
            case "great" -> .20;
            case "good" -> .15;
            case "fair" -> .10;
            case "poor" -> .05;
            default -> 0.2;
        };

        double tipAmount = checkAmount * tip;
        double totalPay = checkAmount + tipAmount;

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Base amount: " + checkAmount);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + tipAmount);

        if (yesOrNo.equalsIgnoreCase("yes")) {
            System.out.println("Total per person: " + (totalPay / numberOfPeople));
            System.out.println("Tip per person: " + (tipAmount / numberOfPeople));
        }

    }

}
/*
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75
 */
// Create a method that calculate the tip
// Declare variables boolean weSplit, numberOfPeople, checkAmount, use switch for  serviceQuality
// Declare variable totalTip = checkAmount * serviceQuality
// Declare variable totalPay = checkAmount + totalTip

// If split equal true move on to next step or else show whatever above
// Declare variable totalPerPerson = totalToPay / numberOfPeople
// Declare variable tipPerPerson = totalTip / numberOfPeople




