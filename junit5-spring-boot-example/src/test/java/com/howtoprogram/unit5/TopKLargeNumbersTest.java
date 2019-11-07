package com.howtoprogram.unit5;

import com.howtoprogram.TopLargerNumbers;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TopKLargeNumbersTest extends TopLargerNumbers {
    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Test
    public void findTopKLargeNumbers() {
        int[]arr = new int[]{1,2,3,6,7,8};
        logger.info("The top {} numbers are :{}",4,topKlargeNumber(arr,4));
    }
}
