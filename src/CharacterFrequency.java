import java.util.Arrays;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String s = Sc.nextLine();
        int count;
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
             count=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)&&arr[j]!=-1){
                    arr[j]=-1;
                    count++;
                }
            }
            if(count>0) {
                System.out.println(s.charAt(i) + "----->" + count);
//                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
