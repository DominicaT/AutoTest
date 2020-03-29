package com.course.model;

import lombok.Data;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-26 15:49
 **/
@Data
public class UpdateUserInfoCase {
    private int id;
    private int userId;
    private String userName;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
