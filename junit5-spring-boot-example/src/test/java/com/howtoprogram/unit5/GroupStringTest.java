package com.howtoprogram.unit5;

import com.howtoprogram.GroupString;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupStringTest extends GroupString {
    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Test
    public void groupStrings() {
        List<String>inputList = Arrays.asList(new String[]{"abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee"});
        logger.info("The sorted list is :{}",groupStringsAlphabet(inputList));
    }
}
