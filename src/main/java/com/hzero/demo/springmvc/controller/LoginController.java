package com.hzero.demo.springmvc.controller;

import com.hzero.demo.springmvc.domain.User;
import com.hzero.demo.springmvc.service.impl.UserServiceImpl;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 6、一旦选择了合适的控制器， DispatcherServlet 会将请求发送给选中的控制器
 * 到了控制器，请求会卸下其负载（用户提交的请求）等待控制器处理完这些信息
 */
@org.springframework.stereotype.Controller
@RequestMapping("home")//设置主页路径 .../home
public class LoginController {

    @Resource(name = "userService")
    private UserServiceImpl userService;

    @RequestMapping(value = "/login")//通过这个方法打开对应网页后，路径为 .../home/login
    public String goLogin() {
        return "login";
    }

    @PostMapping("loginCheck.do")//点击登录按钮时要执行的校验逻辑
    @ResponseBody
    public String loginDo(String username, String password) {
        System.out.println("传入：" + username + " " + password);
        return userService.login(username, password);
    }

    @RequestMapping(value = "/result")//跳转到result界面，路径为 .../home/result
    public String goResult(ModelMap modelMap, User user) {

        user.setName("Aesop");
        modelMap.addAttribute("user", user);

        return "result";
    }

}
