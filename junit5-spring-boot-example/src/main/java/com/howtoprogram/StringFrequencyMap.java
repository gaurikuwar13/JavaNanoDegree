package com.howtoprogram;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class StringFrequencyMap {

    public static HashMap getStringFrequency(List<String>arr) {
        HashMap<String, Integer> freqMap = new HashMap<>();

        arr.stream()
                .forEach(string ->{
                    if(!(freqMap.containsKey(string))) {
                        int count = 1;
                        freqMap.put(string,count);
                    } else if(freqMap.containsKey(string)){
                        freqMap.put(string,freqMap.get(string)+1);
                    }
                });
        return freqMap;
    }
}
