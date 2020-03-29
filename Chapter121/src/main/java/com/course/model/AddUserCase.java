package com.course.model;

import lombok.Data;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-26 15:44
 **/
@Data
public class AddUserCase {
    private String userName;
    private String password;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
