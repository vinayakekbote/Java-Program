package com.just_practice_TP.practice_18_aug_2026;

import java.util.Arrays;

public class MoveAllZerostotheLast {
    public static void main(String[] args) {
        int[] x = {0, 1, 0, 3, 12};

        int l = x.length-1;

        for(int i=0; i<x.length;i++){
            if(i < l && x[i]==0){
                x[i]=x[l];
                x[l--] = 0;
            }
        }

        System.out.println("x = " + Arrays.toString(x));
    }
}
