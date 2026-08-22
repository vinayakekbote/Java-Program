package com.java8.streamAPI;

import com.java8.Stream_API_DSA.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employees{

    private String name;
    private String dept;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employees(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Amit", "IT", 50000),
                new Employees("Rahul", "HR", 70000),
                new Employees("Sneha", "IT", 90000),
                new Employees("Raj", "HR", 60000),
                new Employees("Priya", "IT", 80000)
        );

        Integer salary = employees.stream()
                .sorted(Comparator.comparing(Employees::getSalary).reversed())
                .skip(1)
                .limit(1)
                .mapToInt(Employees::getSalary)
                .findFirst()
                .getAsInt();

        System.out.println("salary = " + salary);

        Map<String, Optional<Employees>> res = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDept, Collectors.maxBy(Comparator.comparing(Employees::getSalary))));

        System.out.println("res = " + res);

    }
}
