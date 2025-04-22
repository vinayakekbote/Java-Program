package com.Basic;

import org.w3c.dom.ls.LSOutput;

class A {
    void printA() {
        System.out.println("Hello from class one");
    }
}

class B extends A {
    void printA() {
        System.out.println("Hello from class two OVERRIDE");
    }

    void printB() {
        System.out.println("Hello from class two");
    }
}

public class Inherit {

    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        b.printB();
    }
}
