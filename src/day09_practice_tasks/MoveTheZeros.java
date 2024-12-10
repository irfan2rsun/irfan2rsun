package day09_practice_tasks;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        // Move all the zeros to the end of the array.
        int[] movedArray = new int[array.length];
        // i ready from nums, j store to moved
        for (int i = 0, j = 0; i < array.length; i++){
            if (array[i]!=0){
                movedArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(movedArray));
    }

}


