package com.TcsNqt;

public class CountSunday {
    public static void main(String[] args) {

        String[] days = {"sun","mon","tue","wed","thu","fri","sat"};

        String d= "mon";
        int c = 28;
        
        int dInC=0;

        for(int i=1; i<days.length;i++){
            if(d.equalsIgnoreCase(days[i])){
                dInC = i;
            }
        }
        
        int sc=0;
        c=c-dInC;
        
        while(c>0){
            sc++;
            c=c/7;
        }

        System.out.println("sc = " + sc);
        
        
        
    }
}
