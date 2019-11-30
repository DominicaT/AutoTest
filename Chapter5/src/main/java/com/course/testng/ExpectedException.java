package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /*
    * 什么时候会用到异常测试？
    * 在我们期望结果为某一个异常的时候
    * 比如我们传入了某些不合法的参数，程序抛出了异常
    * 也比如说我们的运行结果就是这个异常
    * */

    //    这是一个测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }

    //    这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionSuccess() {
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectedS() {
        System.out.println("这是一个异常测试，，，");
        throw new RuntimeException();
    }


}
