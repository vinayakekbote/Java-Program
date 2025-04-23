package com.Exception;

public class ThrowsClass {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
        }
        catch (Throwable e) {
            System.out.println(e.getMessage()+"th");
        }
    }
}
