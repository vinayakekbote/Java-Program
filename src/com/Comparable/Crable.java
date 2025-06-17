package com.Comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Crable{

    int id;
    String name;


    public int compareTo(Crable o) {
        return this.id-o.id;
    }

    public Crable() {
    }

    public Crable(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Crable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Crable> c=new ArrayList<>();
        c.add(new Crable(6,"Vinayak"));
        c.add(new Crable(2,"Mahesh"));

//        Collections.sort(c);
        System.out.println(c);

    }
}
