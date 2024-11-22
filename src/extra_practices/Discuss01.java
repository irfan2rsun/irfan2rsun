package extra_practices;

// First and foremost we need to understand the inner sum(0, 1) method is being called
// As (0 + 1 > 1) is false we go on and print out (0 + 1) and return it which equals to 1
// Now in the main method the outer sum method will be initiated make it look like sum(1,1)
// Back in to the sum method and check the condition as (1 + 1 > 1) is true we return 0 and the code will be terminated
public class Discuss01 {
    public static int sum(int a, int b) {

        if (a + b > 1)
            return 0;
        System.out.print(a + b);
        return a + b;

    }

    public static void main(String[] args) {

        System.out.println(sum(1, sum(0, 1)));

    }
}
