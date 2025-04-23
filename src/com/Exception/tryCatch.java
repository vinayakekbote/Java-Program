package com.Exception;

public class tryCatch {
    static void exceptionThrow() throws ArithmeticException{
        int a=10;
        int b=0;
        int c=a/b;
    }
    public static void main(String[] args) {
        try{
            exceptionThrow();
        }catch (ArithmeticException e){
            System.out.println("This is exception");
        }
    }
}
