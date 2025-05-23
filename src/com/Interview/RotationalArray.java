package com.Interview;

public class RotationalArray {
    public static void main(String[] args) {

        RotationalArray r = new RotationalArray();

        int[] a = {1, 3, 5, 6, 8};
        int target = 4;

        r.reverse(a, 0, a.length - 1);
        r.reverse(a, 0, target);
        r.reverse(a, target, a.length - 1);

        for (int x : a) {
            System.out.print(x);
        }
    }

    public void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
