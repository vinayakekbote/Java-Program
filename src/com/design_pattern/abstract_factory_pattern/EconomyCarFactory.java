package com.design_pattern.abstract_factory_pattern;

public class EconomyCarFactory implements carFactory{


    @Override
    public Seden createSeden() {
        return new EconomySeden();
    }

    @Override
    public SUV createSUV() {
        return new EconomySUV();
    }
}
