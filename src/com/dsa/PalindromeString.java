package com.dsa;

public class PalindromeString {
    public static void main(String[] args) {

        String s = "nan";

        char[] c = s.toCharArray();
        int length = c.length -1;
        boolean b = false;

        for(int i=0;i<c.length/2;i++){
            if(c[i] != c[length--]){
                System.out.println("not palindrom string");
                b = true;
                break;
            }
        }

        if(!b){
            System.out.println("palindrom string");
        }
    }
}
