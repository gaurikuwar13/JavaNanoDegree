package com.howtoprogram;

public class FirstDuplicate {

    public static int firstDuplicate(int[]arr) {
        for(int i = 0 ; i <= arr.length-1; i++) {
            int currentNum = arr[i];
            for(int j =0; j<=arr.length-1; j++) {
                if ((currentNum == arr[j]) && (i!= j) ){
                    return j;
                }
            }
        }
        return -1;
    }
}
