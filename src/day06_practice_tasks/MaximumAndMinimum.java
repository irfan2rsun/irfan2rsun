package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        System.out.println(max(1,13));
        System.out.println(max(1.1,13.1));
        System.out.println(minimum(1,13));
        System.out.println(minimum(1.1,13.1));

    }

    public static int max(int num1, int num2){

        return Math.max(num1,num2);

    }

    public static double max(double num1, double num2){

        return Math.max(num1, num2);

    }

    public static int minimum(int num1, int num2){

        return Math.min(num1,num2);

    }

    public static double minimum(double num1, double num2){

        return Math.min(num1, num2);

    }

}

/*
3. Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100
 */