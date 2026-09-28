package com.InbuildAnnotation;

@MyAnno(myValue = 11, name = "Vinayak")
public class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        Class c = demo.getClass();

        MyAnno an = (MyAnno) c.getAnnotation(MyAnno.class);

        System.out.println("name = " + an.name());
        System.out.println("value = " + an.myValue());
    }

}
