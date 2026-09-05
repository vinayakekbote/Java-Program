package com.Interview.Practice;

import java.util.*;
import java.util.stream.Collectors;

//Find the highest-paid employee in each department.
public class HighestPaidEmp {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1L,"vinayak", "IT", 10L));
        employee.add(new Employee(2L,"Mahesh", "ENTC", 10L));
        employee.add(new Employee(3L,"Govind", "IT", 90L));
        employee.add(new Employee(4L,"Randheer", "ENTC", 80L));
        employee.add(new Employee(5L,"Dinesh", "IT", 85L));
        employee.add(new Employee(6L,"Anush", "ENTC", 50L));

        System.out.println("employee = " + employee);

        Map<Object, Optional<Employee>> emp = employee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println("emp = " + emp);
    }
}
