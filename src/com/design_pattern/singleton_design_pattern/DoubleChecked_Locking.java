package com.design_pattern.singleton_design_pattern;

public class DoubleChecked_Locking {

    private static DoubleChecked_Locking obj;

    private DoubleChecked_Locking(){}

    public static DoubleChecked_Locking getInstance(){
        if(obj == null){
            synchronized (DoubleChecked_Locking.class){
                if(obj == null){
                    obj = new DoubleChecked_Locking();
                }
            }
        }
        return obj;
    }

}
