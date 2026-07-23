package com.dsa.findMissingElement;

import java.util.ArrayList;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,9,4,2,5};
        int count=1;

        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(arr);

        for (int j : arr) {
            if (j == count) {
                count++;
            } else if (j > count) {
                while (j > count) {
                    res.add(count++);
                }
                count++;
            }
        }
        System.out.println("res = " + res);
    }

}
