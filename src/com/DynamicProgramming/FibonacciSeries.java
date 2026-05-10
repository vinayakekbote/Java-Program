package com.DynamicProgramming;

import java.util.Arrays;

public class FibonacciSeries {

    private static int fibo(int[] dp, int n){

            if(n<=1){
                return n;
            }

            if(dp[n] != -1){
                return dp[n];
            }

            dp[n] = fibo(dp,n-1) + fibo(dp, n-2);

            return dp[n];
        }

        public static void main(String args[]){
            int n=5;
            int dp[]=new int[n+1];
            Arrays.fill(dp,-1);
            System.out.println("fibonacci series ans = " + fibo(dp, n));
        }
    }

