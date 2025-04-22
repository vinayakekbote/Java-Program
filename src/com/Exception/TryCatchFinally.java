package com.Exception;

public class TryCatchFinally {
    static int a = 10;
    int b = 20;
    static int c = 0;

    public static void main(String[] args) {
        try {
            int x = TryCatchFinally.a / TryCatchFinally.c;
        }catch (ArithmeticException e){
        } finally {
            System.out.println("All is good");
        }
    }


}
