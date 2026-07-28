package com.design_pattern.abstract_factory_pattern;

public class Main {
    public static void main(String[] args) {
        carFactory carFactory = new LuxuryCarFactory();

        SUV suv = carFactory.createSUV();
        suv.drive();
    }
}
