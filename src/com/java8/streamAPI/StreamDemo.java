package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(1, 4, 7, 9, 4));
        num.add(10);
        num.set(5, 3);

        //filter
        System.out.println(num.stream().filter(x -> x % 2 == 0).count());

        List<Integer> nums = num.stream().map(x -> x * 2).collect(Collectors.toList());
        nums.add(6);
        System.out.println(nums);

        List<Integer> infinite = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(infinite);

        System.out.println(num);
    }
}
