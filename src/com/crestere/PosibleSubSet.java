package com.crestere;

public class PosibleSubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int x = 0; x < arr.length; x++) {
            for (int i = x; i < arr.length; i++) {
                System.out.print("{");
                for (int j = x; j <= i; j++) {
                    System.out.print(arr[j]+",");
                }
                System.out.println("}");
            }
        }
    }
}

