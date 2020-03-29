package com.course.model;

import lombok.Data;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-27 18:02
 **/
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;
}
