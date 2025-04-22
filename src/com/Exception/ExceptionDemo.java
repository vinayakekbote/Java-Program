package com.Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int i = 10 / 2;
            int x = 0;
            try {
                x = 5 / 0;
            }catch (ArithmeticException e2){
                System.out.println("Arithmatic exception occure first");
            }
            System.out.println(i+x);
        } catch (ArithmeticException e1) {
            System.out.println("Arithmatic exception");

        } catch (Exception e) {
            System.out.println("Any type of exception arised");

        }
    }
}