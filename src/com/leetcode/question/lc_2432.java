package com.leetcode.question;

public class lc_2432 {
    public static void main(String[] args) {
        System.out.println(hardestWorker(2,new int[][]{new int[]{0,10},new int[]{1,20}}));
    }
    public static int hardestWorker(int n, int[][] logs) {
        int t=0;
        int worker = 0;
        for(int i=0;i<logs.length;i++){
            for(int j=0;j<logs.length;j++){

                int difference = (j!=0)?logs[j][1]-logs[j-1][1]:0;

                if(difference > t){
                    worker = logs[j][0];
                    t=difference;
                }
                else if(difference == t){
                    worker= Math.min(worker, logs[j][0]);
                    t=logs[j][1];
                }
            }
        }
        return worker;
    }
}
