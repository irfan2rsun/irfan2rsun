package sparta;

import java.util.Scanner;

/*
Write a program that asks a user for the following information. Recommend gym member to the
    highest intensity gym class based on their input. (Note: Member must be at least 16 to participate)
    Class options:
            Teen co-ed: Recommended for all levels; ages 16-20
            Women's beginner fitness: Level: 0+; Age: 21+;
            Men's beginner fitness: Level: 0+; Age: 21+
            co-ed fitness: Level 2+; age: 21+
    Input:  Gym Name: Get Fit
            Member Name: Sarah
            Age: 27
            Gender: f (ignore case sensitivity)
            Experience level (0-3): 2

    Output:
            Thanks for completing the form, Sarah! Get Fit gym recommends you check out our co-ed fitness class.
Here's an assignment I created to go over for tomorrow, if you want to work on it in advance for practice.
 */
// Scanner ask for user input
// If member is under 16 years old they are invalid
// Class options switch
public class Gym {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gym Name: Get Fit");

        System.out.println("Member Name: ");
        String name = input.nextLine();

        System.out.println("Age: ");
        int age = input.nextInt();

        input.nextLine();

        if (age < 16) {
            System.err.println("Gym is 16+ only");
            return;
        }

        System.out.println("Gender: ");
        String gender = input.nextLine().toLowerCase();

        if (!gender.startsWith("m") && !gender.startsWith("f")) {
            System.err.println("Hmmm, I am confused");
            return;
        }

        System.out.println("Experience level (0 - 3): ");
        int experienceLevel = input.nextInt();

        if (experienceLevel < 0 || experienceLevel > 3) {
            System.err.println("ExperienceLevel out of bound, please try again");
            return;
        }

        String fitnessClass = "";
        if (age <= 20) {
            fitnessClass = "Teen co-ed class";
        } else if (gender.equals("f") && experienceLevel>= 0 && age > 21) {
            fitnessClass = "Women's beginner fitness class";
        } else if (gender.equals("m") && experienceLevel>= 0 && age > 21) {
            fitnessClass = "Men's beginner fitness class";
        } else if (experienceLevel >= 2){
            fitnessClass = "co-ed fitness class";
        }

        input.close();

        System.out.println("Thanks for completing the form, " + name + "! Get Fit gym recommend you check out our " + fitnessClass);

    }

}
