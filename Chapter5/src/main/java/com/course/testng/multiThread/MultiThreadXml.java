package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 15:10
 **/
public class MultiThreadXml {
    @Test
    public void test1() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
