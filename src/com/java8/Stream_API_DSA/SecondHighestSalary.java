package com.java8.Stream_API_DSA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {

        List<Employee> data = new ArrayList<>();

        data.add(new Employee(1,100000,"Vinayak"));
        data.add(new Employee(2,110000,"mahesh"));
        data.add(new Employee(3,90000,"Anush"));
        data.add(new Employee(4,90000,"Govind"));
        data.add(new Employee(5,100000,"Dinesh"));

        data.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

    }
}
