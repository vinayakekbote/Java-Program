package com.design_pattern.singleton_design_pattern;


public class EagerSingleton {

    private EagerSingleton() {
    }

    public static final EagerSingleton obj = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return obj;
    }


}
