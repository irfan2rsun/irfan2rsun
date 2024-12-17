package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {
        // 10.1 Given an ArrayList of characters, remove all the letters.
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        list.removeIf(p -> Character.isLetter(p));// Why are we passing p here

        System.out.println(list);

    }

}

