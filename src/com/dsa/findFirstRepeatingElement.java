package com.dsa;

public class findFirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,6,4,8,2,4};

        int repeatElement = 0;
        for(int i : arr){
            for(int j=i+1; j<arr.length; i++){
                if(arr[i]==arr[j]){
                    repeatElement = arr[i];
                    break;
                }
            }
        }

        if(repeatElement!=0){
            System.out.println("repeatElement = " + repeatElement);
        }else {
            System.out.println("no have any repeating element");
        }
    }
}
