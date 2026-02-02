package com.BasicInterviewProgramming;

public class Largest_Of_3_Numbers {

    public int largestNumber(int a,int b,int c){

        if(a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;
        }

            return c;
    }

    public static void main(String[] args) {
        Largest_Of_3_Numbers l=new Largest_Of_3_Numbers();
        int a=56;
        int b=55;
        int c=26;

        int res=l.largestNumber(a,b,c);
        System.out.println("res =>> " + res);
    }
}
