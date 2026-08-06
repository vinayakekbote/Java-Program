package com.dsa.find_first_duplicate_using_Linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Duplicate {
    public static void main(String[] args) {

        int[] arr = {101, 102, 103, 102, 104, 105};

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() +" "+ entry.getValue());
            }
    }
}
