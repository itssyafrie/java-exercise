package com.adepuu.exercises.session5;

import java.util.HashMap;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1};
        System.out.println(containsDuplicate(num));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numHistory = new HashMap<>();

        for (int n : nums){
            if (!numHistory.containsKey(n)){
                numHistory.put(n, 1);
            }else{
                return true;
            }
        }
        return false;
    }
}
