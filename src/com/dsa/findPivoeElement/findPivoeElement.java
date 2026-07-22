package com.dsa.findPivoeElement;

public class findPivoeElement {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};

        int[] leftSum = new int[arr.length];
        int[] rightSum = new int[arr.length];

        leftSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        boolean b = false;
        int res = 0;
        for(int i=0;i<arr.length;i++){

            if(leftSum[i] == rightSum[i]){
                res = arr[i];
                b = true;
            }
        }

        if(b){
            System.out.println("Pivot Element is = " + res);
        }else {
            System.out.println("Pivot element is not present");
        }

    }
}
