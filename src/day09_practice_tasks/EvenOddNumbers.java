package day09_practice_tasks;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        // Counts the even and odd numbers from an array of integers
        int evenCounts = 0, oddCounts = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evenCounts++;
            } else {
                oddCounts++;
            }
        }
        System.out.println("The array has " + oddCounts + " odd numbers and " + evenCounts + " even numbers");
    }
}
