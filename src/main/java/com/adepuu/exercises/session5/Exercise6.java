package com.adepuu.exercises.session5;
import java.util.ArrayList;
public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3, 5, 1};
        ArrayList<Integer> arrNew = new ArrayList<>();
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != j) {
                arrNew.add(arr[i]);
            }
        }
        System.out.println("The new array is: " + arrNew);
    }
}
