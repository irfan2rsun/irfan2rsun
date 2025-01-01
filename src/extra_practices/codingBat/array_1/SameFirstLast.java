package extra_practices.codingBat.array_1;

/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
 */
public class SameFirstLast{
    public static void main(String[] args) {

        int[] test1 ={1,2,1};
        boolean result = sameFirstLast(test1);
        System.out.println(result);
    }


    public static boolean sameFirstLast(int[] nums) {
        int firstNums = nums[0];
        int lastNums = nums[nums.length-1];
        return firstNums == lastNums;
    }

}
