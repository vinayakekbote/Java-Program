package com.java8.Stream_API_DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//print duplicate numbers only
public class printDuplicateNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,2,3,6,7,8,5,9,10);
        Set<Integer> num = new HashSet<>();
        list.stream()
                .filter(x -> !num.add(x))
                .forEach(System.out::println);

    }
}
