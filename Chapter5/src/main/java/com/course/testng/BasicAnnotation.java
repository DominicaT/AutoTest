package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
        System.out.println("���ǲ�������1");
    }

    @Test
    public void testCase2() {
        System.out.println("���ǲ�������2");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest����");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest����");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod�����ڲ��Է���֮ǰ���е�");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod�����ڲ��Է���֮�����е�");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass������������֮ǰ���еķ���");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass������������֮�����еķ���");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite�����׼�");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite�����׼�");
    }
}
