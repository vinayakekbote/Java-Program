package com.TcsNqt;

import java.util.*;

public class TCSInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] str = s.split(",");

        System.out.println("s =>> " + Arrays.toString(str));
    }
}
