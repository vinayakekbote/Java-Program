package com.just_practice_TP.practice_18_aug_2026;

public class FindHighestElement {
    public static void main(String[] args) {

        int[] x = {5,8,2,6,1};

        int max = x[0];
        for(int i : x){
            if(i > max){
                max = i;
            }
        }

        System.out.println("max = " + max);

    }
}
