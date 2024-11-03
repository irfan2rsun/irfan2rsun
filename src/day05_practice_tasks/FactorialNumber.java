package day05_practice_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 10;
        long factorialNum= 1;

        for (int i = num; i > 0; i--){

            factorialNum = factorialNum * i;

        }

        System.out.println(factorialNum);


    }

}

/*
5. Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */