package com.wipro.test;

import com.wipro.task.DailyTasks;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {
        DailyTasks tasks = new DailyTasks();
        String result = tasks.doStringConcat("Hello", "World");
        assertEquals("Hello World", result);
    }
}

