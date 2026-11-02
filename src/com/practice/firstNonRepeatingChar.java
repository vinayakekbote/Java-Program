package com.practice;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbc";
        String prev = "";

        for(int i=0;i<str.length(); i++){
            int x = i;
            String s = String.valueOf(str.charAt(i));

            String sub = str.substring(x+1, str.length());
            // System.out.println(prev);
            if(!sub.contains(s) && !prev.contains(s)){
                System.out.println("First non repeating character is = "+ s);
                break;
            }
            prev = prev + s;
        }
    }
}
