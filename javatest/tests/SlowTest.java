package tests;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SlowTest {

    @Test
    public void slow() throws InterruptedException {
        Thread.sleep(1_000);
        assertTrue(1 == 1);
    }

}
