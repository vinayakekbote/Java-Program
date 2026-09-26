package com.java8.Stream_API_DSA;

import java.util.Arrays;

public class Minumum_odd_number {

    public static void main(String[] args) {

        int[] x = {12, 7, 24, 15, 8, 31, 18};

        Integer res = Arrays.stream(x)
                .boxed()
                .filter(a -> a%2 !=0)
                .sorted()
                .findFirst().get();

        System.out.println("Minimum odd number = " + res);
    }
}
