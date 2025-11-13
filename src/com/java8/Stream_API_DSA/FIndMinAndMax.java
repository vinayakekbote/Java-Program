package com.java8.Stream_API_DSA;

import java.util.Arrays;

public class FIndMinAndMax {
    public static void main(String[] args) {


        int[] arr = {1, 5, 7, 89, 3, 2, 6};

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("min : " + min);

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("max : " + max);


    }
}
