package com.UpcastingDowncasting;

class A {
    void printA() {
        System.out.println("Hello from class A");
    }
}

class B extends AA {
    void printB() {
        System.out.println("Hello from class B");
    }
}

public class Upcasting {

    public static void main(String[] args) {
        AA a = new BB();//upcasting

        a.printA();

    }
}
