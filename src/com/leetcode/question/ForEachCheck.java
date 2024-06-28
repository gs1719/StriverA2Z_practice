package com.leetcode.question;

import java.util.Arrays;

public class ForEachCheck {
    public static void main(String[] args) {
//        [[0,2],[2,3]]
        int[] numbers = {0,1,2,3,4,5};

        for(int values:numbers){
            System.out.println("values = " + values);
        }
        System.out.println("=========================================");
                         //  0     1
        int[][] arrays = {{0, 2},{2,3}};

        for(int[] arr: arrays){
            System.out.println(arr[0]+" "+arr[1]);
        }

//        00 = 0
//                01 = 2
//                        10 =2
//                                11 = 3
    }
}
