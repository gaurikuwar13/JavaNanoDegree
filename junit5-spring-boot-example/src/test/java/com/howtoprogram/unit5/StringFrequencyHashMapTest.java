package com.howtoprogram.unit5;

import com.howtoprogram.StringFrequencyMap;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class StringFrequencyHashMapTest extends StringFrequencyMap {
    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Test
    public void stringFrequency () {
        List<String>input= Arrays.asList(new String[]{"abc", "bcd", "abc","def","abcd"});
        logger.info("The HashMap  with Frequency is : {}", getStringFrequency(input));
    }
}
