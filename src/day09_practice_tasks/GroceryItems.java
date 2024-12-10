package day09_practice_tasks;

import java.util.Arrays;

public class GroceryItems {
    public static void main(String[] args) {
        // 10.1 Given the following array:
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        System.out.println("----------------------------");
        // 10.2 Print the following output: (add \t between two words)
        for (String[] eachArr : items) {
            for (String eachItem : eachArr) {
                System.out.print(eachItem + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        // 10.3 Print it in reversed order thorough each one dimensional array
        for (String[] eachArr : items) {
            for (int i = eachArr.length - 1; i >= 0; i--) {
                System.out.print(eachArr[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        // 10.4 Print it in reversed order as a whole (add \t between two words)
        for (int i = items.length - 1; i >= 0; i--) {
            for (String eachItem : items[i]) {
                System.out.print(eachItem + "\t");
            }
            System.out.println();
        }
        /*for (int i = items.length-1; i >= 0; i--){
            System.out.print(Arrays.deepToString(items[i]) + "\t");
            System.out.println();
        }*/

    }

}

