import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int limit =new Scanner(System.in).nextInt();
        int templimit = limit;
        for (int i = 0; i <limit; i++) {

            for (int k= 0; k <i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <limit; j++) {
                System.out.print("* ");
            }
            limit=limit-2;
            System.out.println();
        }
        System.out.println("*");

        for (int i = 3; i <=templimit ; i=i+2) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}


