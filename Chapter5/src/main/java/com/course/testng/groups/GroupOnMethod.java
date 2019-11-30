package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("���Ƿ������Ĳ��Է���111111");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("���Ƿ������Ĳ��Է���22222222");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("���ǿͻ�����Ĳ��Է���333333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("���ǿͻ��˵Ĳ��Է���44444");
    }

    @BeforeGroups("server")
    public void beforeGroupOnServer() {
        System.out.println("���Ƿ����������֮ǰ���еķ���");
    }

    @AfterGroups("server")
    public void afterGroupOnServer() {
        System.out.println("���Ƿ����������֮�����еķ���");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient() {
        System.out.println("���ǿͻ���������֮ǰ���еķ���");
    }

    @AfterGroups("client")
    public void afterGroupOnClient() {
        System.out.println("���ǿͻ���������֮�����еķ���");
    }
}
