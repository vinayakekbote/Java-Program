package com.java8.lambda;

import java.util.concurrent.Flow;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuildInMethods {
    public static void main(String[] args) {

        //Predicate(Single Input, return Boolean)
        Predicate<Integer> res = (x) -> x%2==0;
        System.out.println("res.test(10) = " + res.test(10));
        System.out.println("res.test(10) = " + res.test(11));

        //Function(Single Input and single output)
        Function<Integer, Integer> fRes = (x) -> x/2;
        System.out.println("fRes.apply(10) = " + fRes.apply(10));

        //Consumer(Single Input no Ouptup)
        Consumer<Integer> cRes = (x) -> System.out.println("there is only input not output  : "+x);
        cRes.accept(20);

        //Supplier(no input return outputs)
        Supplier<String> sRes = () -> "It is only return type not taken any input";
        System.out.println("sRes = " + sRes.get());

    }
}
