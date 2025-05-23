package com.Interview;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "abdc";
        String s1 = "abcd";

        boolean b = false;

        if (s.length() == s1.length()) {
            char[] c = s.toCharArray();
            char[] c1 = s1.toCharArray();

            Arrays.sort(c);
            Arrays.sort(c1);

            if (Arrays.equals(c, c1)) {
                System.out.println("String is Anagram");
            } else {
                System.out.println("String is Not Anagram");
            }
        } else {
            System.out.println("String is not Anagram");
        }
    }
}
