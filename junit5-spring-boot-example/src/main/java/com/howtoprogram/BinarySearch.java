package com.howtoprogram;

public class BinarySearch {

        public static int findTarget(int[] arr, int target) {
            if (arr.length == 0) return -1;
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid+1;
                } else if (arr[mid] > target) {
                    end = mid-1;
                }
            }
            return -1;
        }
}
