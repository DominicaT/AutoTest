package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 15:01
 **/
public class MultiThreadOnAnnotation {
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test1() {
        System.out.println(1);
        System.out.printf("Thread id: %s%n", Thread.currentThread().getId());
    }
}
