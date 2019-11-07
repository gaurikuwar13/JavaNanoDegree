package com.howtoprogram;

public class PrintPermute {
    public static void printPermuteArray(int[]arr, int index) {

        int size = arr.length;

        if (size == index + 1) {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            for (int i = index; i < size; i++) {

                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                printPermuteArray(arr, index + 1);
            }
        }
    }
}
