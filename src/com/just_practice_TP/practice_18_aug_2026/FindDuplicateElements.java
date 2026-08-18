package com.just_practice_TP.practice_18_aug_2026;

public class FindDuplicateElements {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 2, 4, 3, };

        for(int i =0; i<x.length; i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]==x[j]){
                    System.out.println("duplicates = " + x[i]);
                    break;
                }
            }
        }

    }
}
