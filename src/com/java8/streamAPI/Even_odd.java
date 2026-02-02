package com.java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class Even_odd {
    public static void main(String[] args) {

        int num[] = {8,4,6,1,3,4,5,6,7,2,8,9};

        Set<Integer> a = Arrays.stream(num).filter(n -> n%2 == 0)
                .sorted()
                .boxed()
                .collect(Collectors.toSet());

        System.out.println("a =>> " + a);


    }
}
