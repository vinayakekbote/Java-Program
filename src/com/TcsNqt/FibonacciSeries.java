package com.TcsNqt;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=0,b=1,c=0;

        for(int i=0;i<n;i++){
            c=a+b;
            System.out.println("res =>> " + a);
            b=a;
            a=c;
        }

    }
}
