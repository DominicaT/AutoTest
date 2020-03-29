package com.course.model;

import lombok.Data;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-26 15:46
 **/
@Data
public class GetUserInfoCase {
    private int userId;
    private String expected;
}
