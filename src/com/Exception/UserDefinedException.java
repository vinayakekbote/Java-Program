package com.Exception;

class PremException extends Exception {
    PremException() {
        super();
        System.out.println("This is user defined prem Exception");
    }
}

public class UserDefinedException extends PremException {

    public static void main(String[] args) {
        int i = 10;
        int j = 2;

        try {
            int c = i + j;
            throw new PremException();

        } catch (PremException e) {
            System.out.println(e);
        }
    }
}
