package com.Interview;

public class reverseStringCharacters {

    public static void main(String[] args) {

        String s = "Hello";
        StringBuilder res = new StringBuilder();

        char[] c=s.toCharArray();

        for(int i=s.length()-1;i>=0;i--){
            res.append(c[i]);
        }

        System.out.println("res = " + res);
    }
}
