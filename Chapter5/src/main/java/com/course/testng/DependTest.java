package com.course.testng;

import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 14:16
 **/
public class DependTest {

    @Test
    public void test1() {
        System.out.println("Test1 Run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("Test2 Run");
    }
}

