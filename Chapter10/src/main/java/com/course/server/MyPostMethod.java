package com.course.server;

import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: AutoTest
 * @description: Post请求
 * @author: Domi
 * @create: 2019-12-05 21:45
 **/
@RestController
@Api(value = "/",description = "这是我全部的post请求")
@RequestMapping("/v1")
public class MyPostMethod {

//    这个变量是用来装我们的cookies信息的
    private static Cookie cookie;

    //    用户登录成功获取到cookies，然后再访问其他接口获取列表
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功后获取Cookies信息", httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName", required = true) String username,
                        @RequestParam(value = "pw", required = true) String password) {
        if (username.equals("zhangsan") && password.equals("123456")) {
            cookie = new Cookie("login", "true");
            response.addCookie(cookie);
            return "恭喜你登录成功";
        }
        return "用户名或者密码错误";
    }

    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                            @RequestBody User user) {
        User user1;
//        获取Cookies
        Cookie[] cookies = request.getCookies();
//        验证cookies是否合法
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login")
                    && cookie.getValue().equals("true")
                    && user.getUserName().equals("zhangsan")
                    && user.getPassword().equals("123456")) {
                user1 = new User();
                user1.setName("lisi");
                user1.setAge("18");
                user1.setSex("man");
                return user1.toString();
            }
        }
        return "参数不合法";

    }

}
