package com.howtoprogram.unit5;

import com.howtoprogram.BinarySearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;


public class BinarySearchTest extends BinarySearch{

	protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	int[] arr = new int[]{1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
	int[] outOfBoundArr = new int[] {1,2,3,4,5};

	@Test
	public void binarySearch() {
		assertThat(findTarget(arr,11)).isEqualTo(5);
		assertThat(findTarget(outOfBoundArr,10)).isEqualTo(-1);
		logger.info("The index of 11 is : {}",findTarget(arr,11));
		logger.info("The index of 10 is : {}",findTarget(outOfBoundArr,10));
	}
}