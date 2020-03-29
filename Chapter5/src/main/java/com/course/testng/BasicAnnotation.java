package com.course.testng;

import org.testng.annotations.*;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 00:08
 **/
public class BasicAnnotation {
    @Test
    public void testCase1() {
        System.out.printf("Thrad Id: %s%n", Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod这个是在测试方法前运行");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod这个是在测试方法后运行");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass这个是在类运行前执行");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass这个是在类运行前执行");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite测试套件");
    }
}
