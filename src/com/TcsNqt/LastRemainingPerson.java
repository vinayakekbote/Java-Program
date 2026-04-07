package com.TcsNqt;

import java.util.ArrayList;
import java.util.Scanner;

public class LastRemainingPerson {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        String sc1=sc.nextLine();
        String[] str=sc1.split(" ");

        ArrayList<Integer> a=new ArrayList<>();
        for(String s : str){
            a.add(Integer.parseInt(s));
        }

        int count=0;
        while(a.size()>1){
            for(int i=0;i<a.size();i++){
                count++;
                if(count==k){
                    a.remove(i);
                    i--;
                    count=0;
                }
            }
        }

        System.out.println(a.get(0));
    }
}
