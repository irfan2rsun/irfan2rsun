package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        //3.1 Given an ArrayList, duplicate each element in the list.
        ArrayList<Integer> list = new ArrayList<> (Arrays.asList(1,2,3,4,5));
        int size = list.size();
        for (int i = 0; i < size; i++){
            list.add(list.get(i));
        }

        System.out.println(list);

        // Option2:

        ArrayList<Integer> list2 = new ArrayList<> (Arrays.asList(1,2,3,4,5));
        list2.addAll(list2);
        System.out.println(list2);

    }

}
