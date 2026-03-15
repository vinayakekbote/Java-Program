package com.TcsNqt;

public class DecimalBitToggleInBinary {
    public static void main(String[] args) {
        int num=10;
        String result="";
        
        String binary = Integer.toBinaryString(num);
        for(int i=0;i<=binary.length()-1;i++){
            if(binary.charAt(i)=='1'){
                result += '0';
            }else if(binary.charAt(i)=='0'){
                result+='1';
            }
        }

        int ans= Integer.parseInt(result,2);

        System.out.println("binary = " + ans);
    }
}
