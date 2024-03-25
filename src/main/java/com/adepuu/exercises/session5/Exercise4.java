package com.adepuu.exercises.session5;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void removeDuplicates(int[] arr) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hmap.containsKey(arr[i])) {
                hmap.put(arr[i], 1);
            }
        }
        System.out.print(hmap.keySet());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};
        removeDuplicates(arr);
    }
}
