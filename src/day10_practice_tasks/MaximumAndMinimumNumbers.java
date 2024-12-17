package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        //  7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }

}
