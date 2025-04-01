package com.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 8};

        int start = 0;
        int end = arr.length - 1;

        int element = 6;

        while (start <= end) {
            int mid = (start+end)/2;
            if (element == arr[mid]) {
                System.out.println("Element found in index = " + mid);
                break;
            } else if (element > arr[mid]) {
                start = mid + 1;
            } else if (element < arr[mid]) {
                end = mid - 1;
            }
        }
    }
}
