package com.howtoprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TopLargerNumbers {
    public static TreeSet topKlargeNumber (int[] arr,int k) {
        TreeSet<Integer> treeset = new TreeSet<>();
        for(int num : arr) {
            treeset.add(num);
            if (treeset.size() > k){
                treeset.pollFirst();
            }
        }
        return treeset;
    }
}
