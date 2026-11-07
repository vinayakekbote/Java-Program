package com.practice;

public class SecondHighestNum {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 20, 15};

        int high = Integer.MIN_VALUE;
        int s_high = Integer.MIN_VALUE;

        for(int x : arr){
            if(x > high) {
                s_high = high;
                high = x;
            }else if(x > s_high && x != high){
                s_high = x;
            }
        }

        System.out.println("Second Highest Number is : " + s_high);

    }
}
