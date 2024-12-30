package extra_practices.codingBat.warm_up;

/*
        Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


        nearHundred(93) → true
        nearHundred(90) → true
        nearHundred(89) → false*/
public class NearHundred {
    public static void main(String[] args) {

        NearHundred nearHundred1 = new NearHundred();
        boolean result1 = nearHundred1.nearHundred(93);
        System.out.println(result1);

        NearHundred nearHundred2 = new NearHundred();
        boolean result2 = nearHundred2.nearHundred(211);
        System.out.println(result2);

    }

    public boolean nearHundred(int num) {

        return Math.abs(num - 100) <= 10 || Math.abs(num - 200) <= 10;

    }

}
