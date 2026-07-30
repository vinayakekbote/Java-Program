package com.array2d;

import java.util.ArrayList;
import java.util.List;

public class Sum_Of_All_Rows {
    public static void main(String[] args) {

        int[][] arr = {{1,4,2},{6,5,4},{9,6,1}};
        Sum_Of_All_Rows sum = new Sum_Of_All_Rows();

        sum.sumOfAllRows(arr);
    }

    private void sumOfAllRows(int[][] arr) {
        int l = arr[0].length;
        List<Integer> res = new ArrayList<>();
        for(int col=0; col<arr.length;col++){
            int sum = 0;
            for(int row=0; row<l; row++){
                sum = sum + arr[col][row];
            }
            res.add(sum);
        }

        System.out.println("res = " + res);
    }
}
