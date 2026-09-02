package com.java8.streamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqOfEachNum {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 30);

        Map<Integer, Long> data =  numbers.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        for(Map.Entry<Integer,Long> x : data.entrySet()){
            System.out.println(x.getKey() + " = " + x.getValue());
        }

    }
}
