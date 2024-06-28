package com.leetcode.question;

public class lc0906_Q1 {
    public static void main(String[] args) {
        System.out.println(numberOfChild(5,6)); //2 //0 1 2 3 4
    }

    public static int numberOfChild(int n, int k) {
        int p=0;
        int flag =0;
        for(int i=0;i<k;i++){
            if(p==n-1)
                flag = 1;
            else if(p==0)
                flag = 0;

            if(flag==1)
                p--;
            else
                p++;
        }
        return p;
    }
}
