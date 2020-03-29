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
 * @author: Domi
 * @create: 2020-03-25 18:06
 **/
@RestController
@Api(value = "/", description = "这是我的全部post请求")
@RequestMapping("/v1")
public class MyPostMehtod {
    //    这个变量是用来装我么的cookies信息
    private static Cookie cookie;

//    用户登录成功获取到cookies，然后在访问其他接口列表

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功后获取cookies信息", httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName", required = true) String name,
                        @RequestParam(value = "pw", required = true) String password) {
        if (name.equals("zhangsan") && password.equals("123456")) {
            cookie = new Cookie("login", "true");
            response.addCookie(cookie);
            return "Congratulations";
        }
        return "用户名或者密码错误！";
    }

    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                            @RequestBody User user) {
        User user1;

//        获取cookies
        Cookie[] cookies = request.getCookies();
//        验证cookies是否合法
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login")
                    && cookie.getValue().equals("true")
                    && user.getUsername().equals("zhangsan")
                    && user.getPassword().equals("123456")) {
                user1 = new User();
                user1.setName("lisi");
                user1.setAge("19");
                user1.setSex("man");
                return user1.toString();
            }
        }
        return "参数不合法";
    }


}
