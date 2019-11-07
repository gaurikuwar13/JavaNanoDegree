package com.howtoprogram;

import java.util.ArrayList;
import java.util.List;

public class GroupString {

    public static List<List<String>> groupStringsAlphabet(List<String> inputArr) {
        List<List<String>> outputString = new ArrayList<>() ;
        List<String> stringWitha = new ArrayList<>();
        List<String> stringWithb = new ArrayList<>();
        List<String> stringWithOtherThanc = new ArrayList<>();
        inputArr.stream()
                .forEach(string -> {
                    if((string.startsWith("a"))){
                        stringWitha.add(string);
                    }else if ((string.startsWith("b"))){
                        stringWithb.add(string);
                    }else {
                        stringWithOtherThanc.add(string);
                    }
                });
        outputString.add(stringWitha);
        outputString.add(stringWithb);
        outputString.add(stringWithOtherThanc);
        return outputString;
    }
}
