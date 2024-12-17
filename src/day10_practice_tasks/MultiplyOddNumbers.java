package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {
        // 6.1 Given an ArrayList, multiply each odd number by 2.
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < list.size(); i++) {
            int eachNum = list.get(i);
            if (eachNum % 2 == 1) {
                list.set(i, eachNum * 2);
            }

        }

        System.out.println(list);

    }

}
