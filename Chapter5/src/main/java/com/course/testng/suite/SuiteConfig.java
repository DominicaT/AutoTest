package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 00:31
 **/
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite运行");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite 运行");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
}
