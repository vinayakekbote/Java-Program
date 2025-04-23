package com.Basic;

class X{
    private void show(){
        System.out.println("this is from class A");
    }

    static void show1(){
        System.out.println("this is from class A");
    }
}

public class EX extends X{
    private void show(){
        System.out.println("this is from class B");
    }
    static void show1(){
        System.out.println("this is from class B");
    }
    public static void main(String[] args) {
        EX e=new EX();
//        e.show();
        e.show1();
    }
}
