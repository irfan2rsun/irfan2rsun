package day04_practice_tasks;

public class Calculator {

    public final static char SUBTRACTION = '-';
    public final static char ADDITION = '+';
    public final static char MULTIPLICATION = '*';
    public final static char DIVISION = '/';
    public final static char MODULATION = '%';

    public static void main(String[] args) {

        char operator = '-';
        double n1 = 10, n2 = 20;

        switch (operator) {
            case SUBTRACTION -> System.out.println(n1 - n2);
            case ADDITION -> System.out.println(n1 + n2);
            case MULTIPLICATION -> System.out.println(n1 * n2);
            case DIVISION -> System.out.println(n1 / n2);
            case MODULATION -> System.out.println(n1 % n2);
        }

    }

}

/*
10. Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		For any other operators, print "invalid operator."

            Example:
                  n1 = 10, n2 = 20, mathOperator = '+'

            Output:
                  30
 */