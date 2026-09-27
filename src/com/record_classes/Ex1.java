package com.record_classes;

record Alience(int id, String name)
{};

public class Ex1 {
    public static void main(String[] args) {

        Alience a1 = new Alience(1, "Vinayak");
        Alience a2 = new Alience(2, "Govind");

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

    }
}
