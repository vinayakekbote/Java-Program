package com.UpcastingDowncasting;

class AA {
    void printA() {
        System.out.println("Hello from class A");
    }
}

class BB extends AA {
    void printB() {
        System.out.println("Hello from class B");
    }
}

public class DownCasting {

    public static void main(String[] args) {
        AA a=new AA();
        BB b= (BB) a;

        b.printA();

    }
}
