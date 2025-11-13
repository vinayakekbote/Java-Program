package com.java8.Stream_API_DSA;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 89, 3, 2, 6};

        int[] b= IntStream.range(0,arr.length)
                .map(i->arr[arr.length-1-i])
                .toArray();

        System.out.println(Arrays.toString(b));
    }
}
