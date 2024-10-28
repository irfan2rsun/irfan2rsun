package day04_practice_tasks;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 0, b = 0, c = 0; // a < c b < a b < c

        if (a < b && b < c) {
            System.out.println(b + " is the median number");
        } else if (a < b && a < c && c < b) {
            System.out.println(c + " is the median number");
        } else if (b < a && c < a && c < b) {
            System.out.println(b + " is the median number");
        } else if (a < b && c < b && c < a) {
            System.out.println(a + " is the median number");
        } else if (b < a && b < c && c < a) {
            System.out.println(c + " is the median number");
        } else if (a < c && b < a && b < c) {
            System.out.println(a + " is the median number");
        } else {
            System.out.println("a, b and c are equal numbers");
        }

    }

}

/*
4. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */