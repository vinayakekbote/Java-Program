package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindNthHighestSalary {
    public static void main(String[] args) {

        List<Integer> salary = Arrays.asList(6000,8000,5000,10000,20000,15000);
        int n = 2;

        salary.stream()
                .sorted((a,b)->b-a)
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);


    }
}
