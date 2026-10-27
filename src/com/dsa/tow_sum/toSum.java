package com.dsa.tow_sum;

public class toSum {
    public static void main(String[] args) {

        int[] nums = {9,2,8,5};
        int target = 13;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i] + nums[j]) == target){
                    System.out.println("[" + i + "," + j + "]");
                    break;
                }
            }
        }

    }
}
