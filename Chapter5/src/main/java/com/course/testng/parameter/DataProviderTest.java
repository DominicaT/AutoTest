package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 14:35
 **/
public class DataProviderTest {
    @Test(dataProvider = "data111")
    public void testDataProvider(String name, int age) {
        System.out.println("name = " + name + "; age = " + age);
    }

    @DataProvider(name = "data111")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"duomi", 18},
                {"Jaz", 16},
                {"Ti", 1}
        };
        return  o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1111 name = " + name + "; age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test22222 name = " + name + "; age = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataProvider(Method method) {
        Object[][] result = null;

        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan", 11},
                    {"lisi", 13}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"wangwu", 14},
                    {"maliu", 34}
            };
        }
        return result;
    }
}
