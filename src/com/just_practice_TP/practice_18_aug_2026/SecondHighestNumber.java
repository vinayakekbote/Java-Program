package com.just_practice_TP.practice_18_aug_2026;

public class SecondHighestNumber {
    public static void main(String[] args) {

        int[] x = {5,8,2,6,1};

        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        for(int i : x){
            if(i > max){
                s_max = max;
                max = i;
            }else if(i > s_max){
                s_max = i;
            }
        }

        System.out.println("s_max = " + s_max);
    }
}
