package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 14:23
 **/
public class ParameterTest {

    @Test
    @Parameters({"name", "age"})
    public void parameterTest(String name, int age) {
        System.out.println("name = " + name + "; age = "+ age);
    }
}
