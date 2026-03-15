package com.TcsNqt;

import java.util.Arrays;

public class ZeroToEnd {
    public static void main(String[] args) {
        int[] num = {4,0,8,1,0,5,8};

        int[] num2= new int[num.length];
        int count=0;

        for(int i : num){
            if(i!=0){
                num2[count++] = i;
            }
        }

        for(int i=0;i<num.length-count;i++){
            num2[count++]=0;
        }

        System.out.println("count =>> " + Arrays.toString(num2));

    }
}
