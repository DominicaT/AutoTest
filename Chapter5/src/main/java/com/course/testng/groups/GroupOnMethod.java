package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 13:44
 **/
public class GroupOnMethod {
    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端组的测试方法1111111");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端组测试方法22222222");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是客户端组测试方法33333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端组测试44444444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer() {
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupOnServer() {
        System.out.println("这是服务端组运行之后的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient() {
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupOnClient() {
        System.out.println("这是客户端组运行之后的方法");
    }

}
