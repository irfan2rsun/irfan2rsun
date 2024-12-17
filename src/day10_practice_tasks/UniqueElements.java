package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        // 9.1 Given an ArrayList, display the unique elements without using any loops.
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        //        p: eachElements (Check the frequency of p from list)
        list.removeIf(p -> Collections.frequency(list, p) > 1);
        System.out.println(list);
    }
}
