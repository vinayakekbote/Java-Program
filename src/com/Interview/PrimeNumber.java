package com.Interview;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 12;
        boolean b = false;

        if (n == 0 || n == 1) {
            System.out.println("Prime number");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
        }

        if (!b) {
            System.out.println("Not Prime number");
        } else {
            System.out.println("Prime number");
        }
    }
}
