package com.dsa.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9};
        int target = 8;
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.binarySearchTargetValue(arr, target);

        if(index > 0){
            System.out.println("found the element in index = " + index);
        }else {
            System.out.println(" element not found ");
        }
    }

    private int binarySearchTargetValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(target <= arr[mid]){
                end = mid + 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}