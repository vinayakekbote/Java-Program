package com.java8.lambda;

public class Main {
    public static void main(String[] args) {

//        JavaImpleMethod j=new JavaImpleMethod();
//        System.out.println(j.hello());


//        JavaImplement java = new JavaImplement() {
//            @Override
//            public String hello() {
//                return "This is from main method";
//            }
//        };
//
//        System.out.println(java.hello());

        JavaImplement java=()-> {
            return "Hello from lambda expression";
        };
        System.out.println(java.hello());






    }
}