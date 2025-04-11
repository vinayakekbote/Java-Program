package com.HefPractice;

import java.io.OptionalDataException;

public class FindMissingNumber {
    //StartOfMainMethod
    public static void main(String[] args) {
        String sequence = "1 2 4 5 6 7 8 9";
        myCode(sequence);
    }

    //EndOfMainMethod
    public static void myCode(String sequence) {
//write your code here
        String[] num = sequence.split(" ");

        int c = 1;
        for (int i = 0; i < num.length; i++) {
            int n = Integer.parseInt(num[i]);
            if (n != c) {
                System.out.println("Missing number: " + (i+1));
                break;
            }
            c++;
        }
    }
}
