package com.howtoprogram;

import java.util.HashSet;

public class TwoSum {
    public static boolean twosum(int[]arr,int sum){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i<=arr.length-1; i++){
            if(hashSet.contains(sum-(arr[i]))){
                return true;
            }else {
                hashSet.add(arr[i]);
            }
        }
        return false;
    }
}
