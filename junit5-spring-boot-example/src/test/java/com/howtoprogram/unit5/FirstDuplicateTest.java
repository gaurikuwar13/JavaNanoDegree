package com.howtoprogram.unit5;

import com.howtoprogram.FirstDuplicate;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstDuplicateTest extends FirstDuplicate {
    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Test
    public void firstDuplicateTest() {
        int[] arr = new int[]{1,2,1,3,3};
        logger.info("The first duplicate occurrence is : {}",firstDuplicate(arr));
    }
}
