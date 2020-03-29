package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 13:51
 **/
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1() {
        System.out.println("GroupsOnClass1中的stu111111运行");
    }

    public void stu2() {
        System.out.println("GroupsOnClass1中的stu2222222运行");
    }
}
