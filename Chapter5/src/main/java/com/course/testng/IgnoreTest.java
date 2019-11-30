package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1() {
        System.out.println("ignore1Ö´ÐÐ");
    }

    @Test(enabled = false)
    public void ignore2() {
        System.out.println("ignore2Ö´ÐÐ");
    }

    @Test(enabled = true)
    public void ignore3() {
        System.out.println("ignore3Ö´ÐÐ");
    }
}
