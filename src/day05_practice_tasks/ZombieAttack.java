package day05_practice_tasks;


public class ZombieAttack {

    public static void main(String[] args) {

    int inhabitant = 100, day = 0;

    while (inhabitant > 0){

        System.out.println("Day " + day + " [" + inhabitant + "]");
        inhabitant = inhabitant / 2;
        day++;

    }
        System.out.println("---- EXTINCT ----");
    }
}

/*
    There is a zombie disease pandemic wiping out populations. Use a `loop` to keep track of the city's population.
    The starting population is given as the `inhabitants` value. Each day the city is losing half of its population.
    Write the program that will show the population day by day, until the city gets to zero.

        Ex:
          Input:
           inhabitants = 6

          Output:
            Day 0 [6]
            Day 1 [3]
            Day 2 [1]
            ---- EXTINCT ----

        Ex:
          Input:
            20

          Output:
            Day 0 [20]
            Day 1 [10]
            Day 2 [5]
            Day 3 [2]
            Day 4 [1]
            ---- EXTINCT ----
 */

