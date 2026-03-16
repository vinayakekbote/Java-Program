package com.TcsNqt;

import java.util.Arrays;
import java.util.Scanner;

public class MinPlatformTrain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String str = sc.nextLine();

        String s = sc.nextLine();

        String[] sarr = s.split(" ");

        int[] arr1 = new int[sarr.length / 2];
        int[] arr2 = new int[sarr.length / 2];

        for( int i = 0; i < sarr.length/2; i++){
            arr1[i] = Integer.parseInt(sarr[i]);
            arr2[i] = Integer.parseInt(sarr[i+(sarr.length/2)]);
        }

        int platform = 1;

        int dtime=arr2[0];

        for(int i=0; i<arr1.length-1; i++){
            if(arr2[i] > dtime) dtime=arr2[i];

            if(arr1[i]<=arr2[i+1] && dtime>=arr1[i+1]){
                platform++;
            }
        }

        System.out.println("platform = " + platform);

    }
}
