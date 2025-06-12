package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOpeations {
    public static void main(String[] args) {

        // 1.Filter
        List<String> Boys = new ArrayList<>(Arrays.asList("Vinayak", "Mahesh", "Govind", "Raju", "Anush", "Dnyaneshwar", "Vinod"));
        List<String> s = Boys.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(s);

        // 2.Map
        List<String> uppercase = Boys.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercase);

        // 3.Reduce
        Optional<String> reduce = Boys.stream().reduce((x, y) -> (x + y));
        System.out.println(reduce);

        Optional<String> longestString = Boys.stream()
                .reduce((x, y) -> x.length() >= y.length() ? x : y);
        System.out.println("Longest String is : " + longestString);

    }
}
