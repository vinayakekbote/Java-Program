package com.java8.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,7,3,3,4,5,6,3,5,7,8,5,4,6,7,5,6,8,1,4,5);

//       list.stream().filter(e -> e<10)
//               .forEach(System.out::println);

//       list.stream().filter(e-> (e <= 4) || (e >= 6)).forEach(System.out::println);

        Set<List> seen=new HashSet<>();
        list.stream().filter(e->!seen.add(Collections.singletonList(e)))
                .findFirst()
                .orElse(null);

//       List<String> sname=Arrays.asList("vinayak","pooja","raju","mahesh","abhishek","shubham").stream()
//               .filter(e->e.length()<6).toList();
//
        System.out.println("seen = " + seen);

    }
}
