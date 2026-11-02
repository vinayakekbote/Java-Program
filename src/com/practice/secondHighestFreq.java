package com.practice;

public class secondHighestFreq {
    public static void main(String[] args) {
        String str = "aabbbccccddddd";

        char c = str.charAt(0);
        int cc = 0;

        char sc = str.charAt(0);
        int scc = 0;

        for(int i=0;i<str.length();i++){
            int count = 1;
            for(int j=i+1;j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > cc){
                scc = cc;
                sc = c;

                cc = count;
                c = str.charAt(i);

            }else if(count > scc){
                scc = count;
                sc = str.charAt(i);
            }
        }
        System.out.println("char = " + sc + ", count = " + scc);
    }
}
