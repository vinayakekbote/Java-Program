package com.Interview;

import java.util.Arrays;
import java.util.HashMap;

public class CharFrequancy {
    public static void main(String[] args) {
        HashMap<Character, Integer> f = new HashMap<>();

        String s = "Hello World";
        s = s.replaceAll(" ", "");
        System.out.println(s);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (f.containsKey(c)) {
                f.put(c, f.get(c) + 1);
            } else {
                f.put(c, 1);

            }
        }
        System.out.println(f.get(s.charAt(6)));
    }
}
