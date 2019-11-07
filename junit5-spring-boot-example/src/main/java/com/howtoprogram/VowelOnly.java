package com.howtoprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelOnly {
    public String vowelcount (String text) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("(?i)[aeiou]");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("The vowel is :"+ matcher.group());
            count++;
            stringBuilder.append(matcher.group());
        }
        System.out.println("The vowels in the string are :" + stringBuilder);
        System.out.println("The count of the vowel is :" + count);
        return stringBuilder.toString();
    }

}
