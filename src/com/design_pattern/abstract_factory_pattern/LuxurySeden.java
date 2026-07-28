package com.design_pattern.abstract_factory_pattern;

public class LuxurySeden implements Seden{
    @Override
    public void drive() {
        System.out.println("Driving Luxury Seden");
    }
}

class LuxurySUV implements SUV{
    @Override
    public void drive() {
        System.out.println("Driving Luxury SUV");
    }
}
