package com.questions.interview;

public class algosum {
    public static void main(String[] args) {
        int[] arr = {80, 30, 15, 70, 5};
        int total = 0;
        for (int j : arr) {
            if (j % 2 == 0)
                total += j;
            else
                total -= j;
        }

        if (total % 2 == 0 && total % 3 != 0)
            System.out.println(total * 2);
        else if (total % 3 == 0 && total % 2 != 0)
            System.out.println(total * 3);
        else if (total % 6 == 0)
            System.out.println(total * 6);
    }
}
