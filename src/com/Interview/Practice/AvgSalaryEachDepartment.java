package com.Interview.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgSalaryEachDepartment {

    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1L,"vinayak", "IT", 10L));
        employee.add(new Employee(2L,"Mahesh", "ENTC", 10L));
        employee.add(new Employee(3L,"Govind", "IT", 90L));
        employee.add(new Employee(4L,"Randheer", "ENTC", 80L));
        employee.add(new Employee(5L,"Dinesh", "IT", 85L));
        employee.add(new Employee(6L,"Anush", "ENTC", 50L));

        Map<String, Double> res = employee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingLong(Employee::getSalary)));

        System.out.println("res = " + res);

    }

}
