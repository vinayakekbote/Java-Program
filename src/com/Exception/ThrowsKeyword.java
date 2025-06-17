package com.Exception;

class Division {
    void div() throws ArithmeticException {
        int c = 10 / 0;
    }
}

public class ThrowsKeyword {

    public static void main(String[] args) {
        Division d = new Division();

        try {
            d.div();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
