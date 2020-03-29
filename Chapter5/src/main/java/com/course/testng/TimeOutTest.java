package com.course.testng;

import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 15:37
 **/
public class TimeOutTest {
    @Test(timeOut = 3000)  //单位为毫秒
    public void test1() throws InterruptedException {
        Thread.sleep(2);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
