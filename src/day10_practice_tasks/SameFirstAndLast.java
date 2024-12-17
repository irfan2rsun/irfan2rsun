package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SameFirstAndLast {
    public static void main(String[] args) {
        // 11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));

        System.out.println(list);
    }
}
