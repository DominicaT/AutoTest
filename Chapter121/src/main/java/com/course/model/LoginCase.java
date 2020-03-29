package com.course.model;

import lombok.Data;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-26 15:48
 **/
@Data
public class LoginCase {
    private int id;
    private String userName;
    private String password;
    private String expected;
}
