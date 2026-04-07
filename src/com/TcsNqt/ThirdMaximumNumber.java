package com.TcsNqt;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdMaximumNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        String[] strArr = str.split(" ");
        int[] arr = new int[strArr.length];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(arr);
        System.out.println(arr[2]);

    }

}
