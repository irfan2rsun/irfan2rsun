package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // 8.1 Given an ArrayList of integers, remove duplicated numbers.
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));

        for (int i = 0; i < list.size(); i++) {
            int duplicate = list.get(i);
            if (duplicate - i == 0) {
                list.remove(duplicate);
            }
        }

        System.out.println(list);

    }

}
