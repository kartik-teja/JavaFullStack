package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.*;

public class TestSort {
	@Test
	public void testSortValues() {
		DailyTasks task = new DailyTasks();
		int[] inputArr = new int[] {3,2,6,9,8};
		int[] expectedArr = new int[] {2,3,6,8,9};
		int[] resultArr = task.sortValues(inputArr);
		assertArrayEquals(resultArr,expectedArr);
		
	}
	
}
