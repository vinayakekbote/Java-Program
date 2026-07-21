package com.dsa.remove_duplicate_from_array;

import java.util.ArrayList;
import java.util.Arrays;

public class ex1 {

    public static void main(String[] args) {

        int[] a = {4,5,3,9,6,8,4,6,5,9};
        ArrayList<Integer> res = findNonRepeatingArray(a);
        System.out.println("res = " + res);
    }

    private static ArrayList<Integer> findNonRepeatingArray(int[] arr) {

        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        return list;
    }

}
