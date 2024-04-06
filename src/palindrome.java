import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = Sc.nextLine();
        s=s.toLowerCase();
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            s1=ch+s1;
        }
        if(s.contentEquals(s1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
