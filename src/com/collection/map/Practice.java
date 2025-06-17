package com.collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

        Map<Integer, String> maps = new HashMap<>();

        maps.put(1, "V");
        maps.put(2, "A");
        maps.put(3, "B");
        maps.put(4, "C");
        maps.put(5, "D");

//        System.out.println(maps);

//        for (int key : maps.keySet()) {
//            System.out.println(key);
//        }
//
//        for (String value : maps.values()) {
//            System.out.println(value);
//        }

        for (Map.Entry<Integer, String> m : maps.entrySet()) {
            System.out.println(m.getKey() + m.getValue());
        }

        System.out.println(maps.get(1));

        System.out.println(maps.remove(2));

        System.out.println(maps.containsKey(4));

        System.out.println(maps.containsValue("V"));

        System.out.println(maps.put(2,"S"));







    }
}
