package com.comparable_comparable;

import java.util.*;

class Emploee implements java.lang.Comparable<Emploee> {
    private int id;
    private String name;
    private int empNumber;

    public Emploee(int id, String name, int empNumber) {
        this.id = id;
        this.name = name;
        this.empNumber = empNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", empNumber=" + empNumber +
                '}';
    }


    @Override
    public int compareTo(Emploee o) {
        return this.id - o.id;
    }
}

public class Comparable {

    public static void main(String[] args) {

//        ArrayList<Integer> res = new ArrayList<>();
//        res.add(86);res.add(10);res.add(64);res.add(92);res.add(19);
//
//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        };
//
//        res.sort(com);
////        Collections.reverse(res);

        //------------------------------------------------------------------

        ArrayList<Emploee> emploees = new ArrayList<>();
        emploees.add(new Emploee(5, "vinayak", 15));
        emploees.add(new Emploee(55, "raje", 18));
        emploees.add(new Emploee(9, "narayan", 14));

        emploees.sort(null);

        System.out.println("res = " + emploees);
    }
}
