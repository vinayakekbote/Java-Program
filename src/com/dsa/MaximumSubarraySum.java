package com.dsa;

public class MaximumSubarraySum {

    private int maxSubArraySum(int[] num) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int a : num){
            sum += a;
            max = Math.max(max, sum);
            if(sum<0){
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] num = {5,4,-1,7,8};
        MaximumSubarraySum maximumSubarraySum = new MaximumSubarraySum();
        int res = maximumSubarraySum.maxSubArraySum(num);
        System.out.println("res = " + res);
    }

}
