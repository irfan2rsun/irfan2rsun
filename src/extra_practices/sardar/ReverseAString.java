package extra_practices.sardar;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "ABCD";
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println(reversed);

        System.out.println("------------------");
        StringBuffer reversed1 = new StringBuffer(input).reverse();
        System.out.println(reversed1);

        System.out.println("------------------");
        String reversed3 = "";
        for (int i = input.length()-1, j = 0; i >= 0; i--,j++){
            reversed3 += input.charAt(i) + "";
        }

        System.out.println(reversed3);

    }

}
