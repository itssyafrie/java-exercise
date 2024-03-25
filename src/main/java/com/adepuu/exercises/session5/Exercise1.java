package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is " + max);
    }
}
