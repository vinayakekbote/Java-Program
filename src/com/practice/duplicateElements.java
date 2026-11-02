package com.practice;

public class duplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};
        for(int i=0;i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("duplicate elements " + arr[i]);
                    break;
                }
            }
        }
    }
}
