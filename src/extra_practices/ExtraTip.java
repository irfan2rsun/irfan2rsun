package extra_practices;

import java.util.Scanner;

public class ExtraTip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)?");
        String yesOrNo = input.nextLine().toLowerCase();

        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();

        input.nextLine();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.nextLine().toLowerCase();

        double tip = switch (serviceQuality) {
            case "excellent" -> .25;
            case "great" -> .20;
            case "good" -> .15;
            case "fair" -> .10;
            case "poor" -> .05;
            default -> .18;
        };

        double totalTip = checkAmount * tip;
        double totalToPay = checkAmount + totalTip;

        System.out.println("numberOfPeople: " + numberOfPeople);
        System.out.println("checkAmount: $" + checkAmount);
        System.out.println("totalTip: $" + totalTip);

        if (yesOrNo.equals("yes")) {
            System.out.println("Total per person: $" + totalToPay / numberOfPeople);
            System.out.println("Tip per person: $" + totalTip / numberOfPeople);
        }

    }

}