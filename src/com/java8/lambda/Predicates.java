package com.java8.lambda;

import java.util.Locale;
import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(10));

        Predicate<String> predicate1 = (x) -> x.toLowerCase().startsWith("v");
        Predicate<String> predicate2 = (x) -> x.toLowerCase().endsWith("k");

        boolean res=predicate1.and(predicate2).test("Vinayak");
        System.out.println(res);

    }
}
