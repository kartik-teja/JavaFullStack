package com.wipro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wipro.task.*;

public class TestCheckPresence {
	@Test
	public void checkPresenceTrue() {
		DailyTasks dt = new DailyTasks();
		boolean result = dt.checkPresence("Hello World", "World");
        assertTrue(result);

	}
	@Test
	public void checkPresenceFalse() {
		DailyTasks dt = new DailyTasks();
		boolean result = dt.checkPresence("Hello World", "Amazing");
        assertFalse(result);
	}
	
}
