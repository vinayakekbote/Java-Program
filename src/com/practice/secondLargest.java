package com.practice;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 30, 40, 15};

        int max = arr[0];
        int smax = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }else if(arr[i] > smax && arr[i] < max){
                smax = arr[i];
            }
        }

        System.out.println("Second Largest Number = "+ smax);

    }
}
