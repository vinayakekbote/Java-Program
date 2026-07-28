package com.design_pattern.prototype_design_pattern;

public class Main {

    public static void main(String[] args) {
        Student obj = new Student(1, "Vinayak", 9325714429L, 1001);
        System.out.println("obj = " + obj);

        Student cloneObj = (Student) obj.clone();
        System.out.println("cloneObj = " + cloneObj);
    }
}
