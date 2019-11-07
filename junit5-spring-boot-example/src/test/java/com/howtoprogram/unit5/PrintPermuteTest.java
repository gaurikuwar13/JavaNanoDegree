package com.howtoprogram.unit5;

import com.howtoprogram.PrintPermute;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintPermuteTest extends PrintPermute {
    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Test
    public void printPermute() {
        int[]arr = new int[]{1, 2, 3};
        printPermuteArray(arr,0);
        logger.info("The permuted array is : {}",arr);

    }
}
