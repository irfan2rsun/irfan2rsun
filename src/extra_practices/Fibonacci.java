package extra_practices;

/*
1. Fibonacci 10
2. 0 1 1 2 3 5 8 13 ...
3. num1, num2
4. next = num1 + num2
5. num1 = num2
6. num2 = next
7. use for loop to repeat 8 times
 */

public class Fibonacci {
    public static void main(String[] args) {

        int num1, num2, next;

        num1 = 0;
        num2 = 1;
        next = num1 + num2;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 0; i < 5; i++) {

            next = num1 + num2;
            System.out.print(next + " ");
            num1 = num2;
            num2 = next;

        }

    }

}
