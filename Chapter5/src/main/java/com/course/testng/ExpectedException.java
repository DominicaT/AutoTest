package com.course.testng;

import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-24 14:07
 **/
public class ExpectedException {
    /**
     * 什么时候会用到异常测试？？
     * 在我们期望结果为一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 也就是我们预期结果就是个异常
     */

//    测试失败
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
