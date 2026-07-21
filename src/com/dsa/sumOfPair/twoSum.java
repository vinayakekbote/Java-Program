package com.dsa.sumOfPair;

import java.util.Arrays;

public class twoSum {

    static int[] arr = null;
    private static int[] findTwoSum(int[] a, int target) {
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if((a[i] + a[j]) == target){
                    arr = new int[]{i, j};
                    return arr;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int a[] = {5,9,4,6,2,6};
        int target = 10;

        int[] res = findTwoSum(a, target);
        System.out.println("res = " + Arrays.toString(res));
    }
}
