package com.dsa.findMaximumAndMinumum;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {6,4,5,9,1,8};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int a : arr){
            if(min > a){
                min = a;
            }

            if(max < a){
                max = a;
            }
        }

        System.out.println("max value is = " + max);
        System.out.println("min value is = " + min);
    }
}
