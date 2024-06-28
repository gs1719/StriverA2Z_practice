package com.leetcode.question;

public class Check {
    public static void main(String[] args) {
        int[] arr1 = {3,4,1,2,6}; // Example array
        int[][] arr2 = {{0, 4}}; // Example queries

        boolean[] value = Solution.isArraySpecial(arr1, arr2);

        // Printing the results
        for (boolean val : value) {
            System.out.println(val);
        }
    }
}

class Solution {
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] answerArray = new boolean[queries.length];
        int p = 0;
        for (int[] mainArr : queries) {
            int i = mainArr[0];
            int j = mainArr[1];
            boolean value = checkArrayIndex(i, j, nums);
            answerArray[p++] = value;
        }
        return answerArray;
    }

    public static boolean checkArrayIndex(int f, int l, int[] nums) {
        for (int i = f; i <= l - 1; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0))
                return false;
        }
        return true;
    }
}
