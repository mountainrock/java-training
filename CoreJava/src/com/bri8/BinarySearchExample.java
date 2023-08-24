package com.bri8;
public class BinarySearchExample {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int loopCount = 0;

        while (left <= right) {
        	loopCount++; 
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
            	System.out.println("Number of loops : "+ loopCount);
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Number of loops : "+ loopCount);

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3,15, 7, 9, 11, 13, 15, 17, 19};
        int target = 11;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
