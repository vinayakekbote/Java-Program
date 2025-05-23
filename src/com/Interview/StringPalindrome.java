package com.Interview;

public class StringPalindrome {
    public static void main(String[] args) {

        String s = "abccbba";
        boolean b = false;

        int l = s.length() - 1;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(l--)) {
                b = true;
            }
        }

        if (!b) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
