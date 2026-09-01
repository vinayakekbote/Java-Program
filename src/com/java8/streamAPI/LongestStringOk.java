package com.java8.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestStringOk {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "SpringBoot", "Hibernate", "SQL", "Microservices");

        Optional<String> s = names.stream()
                .max(Comparator.comparing(String::length));

        System.out.println("s = " + s);
        
    }
    
}
