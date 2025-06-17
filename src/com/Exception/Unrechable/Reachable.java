package com.Exception.Unrechable;

public class Reachable {
    public static void main(String[] args) {
        try {
            int c = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("This is Arithmetic");
        } catch (Exception e) {
            System.out.println("This is exception class");
        }
    }
}
