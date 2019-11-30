package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
//    µ•Œª∫¡√Î÷µ
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
