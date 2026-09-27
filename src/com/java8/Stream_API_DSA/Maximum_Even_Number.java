package com.java8.Stream_API_DSA;

import java.util.Arrays;
import java.util.Comparator;

public class Maximum_Even_Number {

    public static void main(String[] args) {

        int[] x = {12, 7, 24, 15, 8, 31, 18};

        Integer k = Arrays.stream(x)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .filter(a -> a%2 == 0)
                .findFirst().get();

        System.out.println("Maximum even number = " + k);

    }
}
