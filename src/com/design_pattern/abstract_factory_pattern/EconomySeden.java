package com.design_pattern.abstract_factory_pattern;

public class EconomySeden implements Seden{
    @Override
    public void drive() {
        System.out.println("Driving Economy Seden");
    }
}

class EconomySUV implements SUV{
    @Override
    public void drive() {
        System.out.println("Driving Economy SUV");
    }
}
