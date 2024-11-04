package day05_practice_tasks;

public class Triangle {

    public static void main(String[] args) {

        int row = 1, column = 1;
        for (int i = row; i <= 10; i++) {

            for (int j = column; j <= i; j++)

                System.out.print("* ");

            System.out.println();

        }

    }

}

/*
7. Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */