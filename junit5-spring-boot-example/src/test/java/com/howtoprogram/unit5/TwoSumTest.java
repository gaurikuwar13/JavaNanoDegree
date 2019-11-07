package com.howtoprogram.unit5;

import com.howtoprogram.TwoSum;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest extends TwoSum {
    @Test
    public void twoSumTest() {
        int[] arr = new int[]{1,2,1,3,3};
        Assertions.assertThat(twosum(arr,6)).isEqualTo(true);
    }
}
