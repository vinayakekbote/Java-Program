package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumber {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(5,2,1,4,6,3,2,5,9,8,7);
        num.stream()
                .filter(x -> x%2 == 0)
                .sorted()
                .forEach(System.out::println);
    }
}
