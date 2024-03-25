package com.adepuu.exercises.session5;

import java.util.HashMap;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public static void main(String[] args) {
        String anagram1 = "anagram";
        String anagram2 = "nagaram";

        HashMap<Character,Integer> charCount= new HashMap<>();
        for (char c : anagram1.toCharArray()) {
            if (!charCount.containsKey(c)) {
                charCount.put(c, 1);
            } else {
                charCount.put(c,charCount.get(c) + 1);
            }
        }
        for (char c : anagram2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                System.out.println("False");
            } else if (charCount.get(c) == 1) {
                charCount.remove(c);
            } else {
                charCount.put(c, charCount.get(c) -1);
            }
        }
        System.out.println(charCount.isEmpty());
    }
}
