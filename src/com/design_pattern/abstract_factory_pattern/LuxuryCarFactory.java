package com.design_pattern.abstract_factory_pattern;

public class LuxuryCarFactory implements carFactory{
    @Override
    public Seden createSeden() {
        return new LuxurySeden();
    }

    @Override
    public SUV createSUV() {
        return new LuxurySUV();
    }
}
