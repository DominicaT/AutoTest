package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 13:52
 **/
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1() {
        System.out.println("GroupsOnClass22222中运行stu1运行");
    }

    public void stu2() {
        System.out.println("GroupsOnClass22222中运行stu2运行");
    }
}
