package com.practice;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int count = 0;
        for(int j=0;j<arr.length;j++){
            boolean x = false;
            count++;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == count){
                    x = false;
                    break;
                }else{
                    x = true;
                }

            }
            if(x){
                System.out.println(count);
            }
        }
    }
}
