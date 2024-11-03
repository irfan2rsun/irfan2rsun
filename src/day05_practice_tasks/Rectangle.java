package day05_practice_tasks;

public class Rectangle {

    public static void main(String[] args) {

        int row = 8;
        int column = 9;

        for (row = 0; row <= 8; row ++){

            for (column = 1; column <= 8; column++){

                System.out.print("* ");

            }

            System.out.println();

        }

    }

}

/*
1. Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
 */