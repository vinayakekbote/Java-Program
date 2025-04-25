package com.crestere;

public class MonthAndDays {
    public static void main(String[] args) {
        int year=2025;
        boolean b=year%4==0;

        String[] months={"January","February","March","April","May","June","july","August","September","October","November","December"};
        int[] days={30,(b?29:28),31,30,31,30,31,31,30,31,30,31};

        for(int i=0;i<12;i++){
            System.out.println(months[i]+" : "+days[i]);
        }
    }
}
