package com.Interview;

import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 2, 6, 1};

        HashSet<Integer> unique = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            unique.add(a[i]);
        }

        System.out.println(unique);
    }
}
