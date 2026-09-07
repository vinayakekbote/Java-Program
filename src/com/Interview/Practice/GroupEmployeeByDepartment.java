package com.Interview.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupEmployeeByDepartment {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1L,"vinayak", "IT", 10L));
        employee.add(new Employee(2L,"Mahesh", "ENTC", 10L));
        employee.add(new Employee(3L,"Govind", "IT", 90L));
        employee.add(new Employee(4L,"Randheer", "ENTC", 80L));
        employee.add(new Employee(5L,"Dinesh", "IT", 85L));
        employee.add(new Employee(6L,"Anush", "ENTC", 50L));

        Map<String, List<Employee>> res = new HashMap<>();

        for(Employee y : employee){
            if(!res.containsKey(y.getDepartment())){
                res.put(y.getDepartment(), new ArrayList<>());
            }

            res.get(y.getDepartment()).add(y);
        }

        System.out.println("res = " + res);

    }
}
