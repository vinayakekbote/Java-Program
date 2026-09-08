package com.Interview.Practice;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "aabbcc";

        for(int i=0;i<s.length();i++){
            String sub = s.substring(i+1,s.length());
            String r = String.valueOf(s.charAt(i));
            String prev = "";
            prev = prev.concat(r);
            if(!sub.contains(r) && !prev.contains(r)){
                System.out.println("first non repeating char is = " + r);
                break;
            }

        }
        System.out.println(" there is no have any unique char");

    }
}
