package com.java8.optional_class;

import java.util.Optional;

public class OptionalClassExamples {
    public static void main(String[] args) {
        String s = null;
        Optional<String> res = Optional.ofNullable(s);
        System.out.println("res = " + res);

        String res1 = Optional.ofNullable(s).orElse("Unkouwn");
        System.out.println("res1 = " + res1);


    }
}
