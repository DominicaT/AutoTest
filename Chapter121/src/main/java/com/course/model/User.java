package com.course.model;

import lombok.Data;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-26 15:39
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

    @Override
    public String toString() {
        return ("{" +
                "id:" + id + "," +
                "userName:" + userName + "," +
                "password:" + password + "," +
                "age:" + age + "," +
                "sex:" + sex + "," +
                "permission:" + permission + "," +
                "isDelete:" + isDelete + "}");
    }
}
