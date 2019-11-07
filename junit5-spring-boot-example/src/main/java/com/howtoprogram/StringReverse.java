package com.howtoprogram;

public class StringReverse {
    public String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] stringArray = input.toCharArray();
        int i = stringArray.length -1;
        for(int j =i;j>=0;j--){
            stringBuilder.append(stringArray[j]);
        }
        System.out.println("The reverse string is :" + stringBuilder.toString());
        return stringBuilder.toString();
    }
}
