import java.util.Scanner;

public class AverageOfASCII {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int sum = s.chars().sum();
        System.out.println(sum/s.length());
// ==============================Second Method===================================
        int sum1 = 0;
        for (int i = 0; i < s.length(); i++) {
            sum1=sum1+((int)s.charAt(i));
        }
        System.out.println(sum1);
        System.out.println(sum1/s.length());
    }
}
