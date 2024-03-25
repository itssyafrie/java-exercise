package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.Collections;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc”
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc”
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {
        int[] arr1 = new int[]{8, 7, 5, 2};
        Arrays.sort(arr1);
        System.out.println("Array in ascending order: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        Integer[] arr2 = {8, 7, 5, 2};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(arr2));
        }
    }
