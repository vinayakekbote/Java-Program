package com.dsa.sumOfPair;

import java.util.Arrays;

public class threeSum {

    static int[] arr = null;
    private static int[] findTwoSum(int[] a, int target) {
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                for (int k=j+1;k<a.length;k++) {
                    if ((a[i] + a[j] + a[k]) == target) {
                        arr = new int[]{i, j, k};
                        return arr;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int a[] = {5,9,4,6,2,6};
        int target = 14;

        int[] res = findTwoSum(a, target);
        System.out.println("res = " + Arrays.toString(res));
    }
}
