package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})
public class AllTests {
    // This class remains empty. It is used only as a holder for the above annotations.
}
