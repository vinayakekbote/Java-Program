package com.TcsNqt;

import java.util.Arrays;
import java.util.Scanner;

public class MinMxFrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] str=s.split(" ");
        int[] n=new int[str.length];

        for(int i=0;i<n.length;i++){
            n[i]=Integer.parseInt(str[i]);
        }

        int min=n[0];
        int max=n[0];
        int mincount=10000;
        int maxcount=0;
        Arrays.sort(n);
        int count=0;
        for(int i=1;i<n.length;i++){
            if(n[i-1]==n[i]){
                count++;
            }else{
                if(count>maxcount){
                    maxcount=count;
                    max=n[i-1];
                }else if(count<mincount){
                    mincount=count;
                    min=n[i-1];
                }
                count=0;
            }
        }

        System.out.println(min +" "+ max);

    }
}
