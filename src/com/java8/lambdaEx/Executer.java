package com.java8.lambdaEx;


public class Executer {

    public static void main(String[] args) {

        Addition addition = (x, y) -> {
            System.out.println(x + y);
        };

        Substraction substraction = (x, y) -> System.out.println(x - y);

        addition.add(5, 6);
        substraction.sub(55, 9);
    }

}
