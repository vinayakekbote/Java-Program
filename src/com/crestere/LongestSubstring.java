package com.crestere;

public class LongestSubstring {
    public static <string> void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = 0;
        String sub = "";
        int start = 0;

        for (int i = start; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));
            if (sub.contains(ch)) {
                maxLength = s.indexOf(sub);
                start = i + 1;
                ch = String.valueOf(s.charAt(i));
            }else {
                maxLength++;
            }
        }

        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }
}
