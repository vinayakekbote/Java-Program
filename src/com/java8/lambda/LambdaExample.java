package com.java8.lambda;

import com.java8.functionalInterface.Addition;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> res = (a, b) -> System.out.println("sum = " + (a + b));
        res.accept(11, 11);
    }
}
