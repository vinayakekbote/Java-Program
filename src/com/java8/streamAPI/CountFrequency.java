package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "Java", "C++", "Python", "Java", "Go");

        Map<String, Long> frequency = names.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        for(Map.Entry<String, Long> data : frequency.entrySet()){
            System.out.println(data.getKey()+" " + data.getValue());
        }

    }
}
