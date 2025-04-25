package com.crestere;

interface A1{
    static void show() {
        System.out.println("hello");
    }
}

interface A2{
    void show1();
}

class ones implements A1,A2{

    @Override
    public void show1() {
        A1.show();
    }
}

public class Sample{
    public static void main(String[] args) {
        ones o=new ones();
        o.show1();
    }
}
