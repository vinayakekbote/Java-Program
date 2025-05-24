package com.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {

        //Note: function is use for only one date as argument pass
        //one integer for provide value and another is for return
        Function<Integer, Integer> square = (x) -> x * x;
        System.out.println(square.apply(5));

        //Note: BiFunction is used to only two arguments are pass
        //two integer data pass and one for return the data
        BiFunction<Integer,Integer,Integer> sum=(x,y)->x+y;
        System.out.println(sum.apply(20,40));


    }
}
