package com.practice;

public class Merge2SortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 45, 71, 76};
        int[] arr2 = {2, 71, 86, 96};

        int[] res = new int[arr1.length + arr2.length];
        int count =0;
        for(int i=0;i<arr2.length;i++){
            if(arr1[i] < arr2[i]){
                res[count++] = arr1[i];
                res[count++] = arr2[i];
            }else {
                res[count++] = arr2[i];
                res[count++] = arr1[i];
            }
        }

        for(int i=0;i<res.length;i++){
            for(int j=i;j<res.length;j++){
                if(res[i] > res[j]){
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        
        for(int x : res){
            System.out.println("x = " + x);
        }
        
    }
}
