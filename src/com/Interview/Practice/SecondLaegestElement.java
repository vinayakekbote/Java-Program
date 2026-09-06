package com.Interview.Practice;

public class SecondLaegestElement {

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        int h = Integer.MIN_VALUE;
        int sh = Integer.MIN_VALUE;

        for(int i=0;i<arr.length; i++){

            if(arr[i] > h){
                sh = h;
                h = arr[i];
            }else if(arr[i] > sh){
                sh = arr[i];
            }
        }

        System.out.println("second highest number = " + sh);

    }

}
