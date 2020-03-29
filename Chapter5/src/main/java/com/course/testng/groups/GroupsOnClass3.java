package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 13:52
 **/
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1() {
        System.out.println("GroupsOnClass3中的teacher1 运行");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass3中的teacher2 运行");
    }
}
