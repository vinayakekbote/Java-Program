package com.dsa.findMissingElement;

import java.util.ArrayList;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,9,4,2,5};
        int count=1;

        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i] == count){
                count++;
            }else if(arr[i] > count){
                while(arr[i] > count){
                    res.add(count++);
                }
                count++;
            }
        }
        System.out.println("res = " + res);
    }

}
