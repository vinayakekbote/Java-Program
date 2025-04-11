package com.Interview;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] a={11,55,44,88,9,2};
        int l;
        int s;

        if(a[0]>a[1]){
            l=a[0];
            s=a[1];
        }else{
            l=a[1];
            s=a[0];
        }

        for(int i=0;i<a.length;i++){
            if(l<a[i]){
                s=l;
                l=a[i];
            }else if(s<a[i]){
                s=a[i];
            }
        }
        System.out.println("Second largest : "+s);
    }
}
