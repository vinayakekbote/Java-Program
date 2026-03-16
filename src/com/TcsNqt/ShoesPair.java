package com.TcsNqt;

import java.util.Arrays;
import java.util.Objects;

public class ShoesPair {
    public static void main(String[] args) {
        String s = "7L 7R 7L 8L 6R 7R 8R 6R";
        String[] arr = s.split(" ");

        int count = 0;
        for(int x= 0; x< arr.length; x++){
            if(Objects.equals(arr[x], "0")) continue;
            for(int i=x+1; i<arr.length; i++){
                if(arr[x].charAt(0) == arr[i].charAt(0) && arr[x].charAt(1) != arr[i].charAt(1)){
                    count ++;
                    arr[i]="0";
                    break;
                }
            }
        }

        System.out.println("count >> "+count);
    }
}
