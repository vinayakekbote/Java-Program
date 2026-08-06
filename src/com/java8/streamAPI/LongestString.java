package com.java8.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SpringBoot", "Microservices", "API", "Hibernate");

        list.stream()
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
    }
}
