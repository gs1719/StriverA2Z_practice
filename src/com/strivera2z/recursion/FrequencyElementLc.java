package com.strivera2z.recursion;

import java.awt.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;

public class FrequencyElementLc {
    public static void main(String[] args) {
        /*
        * Input: nums = [1,2,4], k = 5
          Output: 3
        *
        *
        *
        * */
        int[] nums = new int[]{1,2,4};
        int k = 5;

        System.out.println(maxFrequency(nums,k));

    }
    public static int maxFrequency(int[] nums, int k) {
        int max= Integer.MIN_VALUE;
        int secMax=max;
        for(int value:nums){
            
            max=Math.max(max,value);
        }
return max;
    }
}
