package com.course.model;

import lombok.Data;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-26 15:47
 **/
@Data
public class GetUserListCase {
    private String userName;
    private String age;
    private String sex;
    private String expected;
}
