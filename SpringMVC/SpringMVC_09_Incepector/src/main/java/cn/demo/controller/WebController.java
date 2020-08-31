package cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Classname WebController
 * @Description TODO
 * @Date 2020/9/1 0:49
 * @Created by XJC·AW
 */
@Controller
@RequestMapping("/controller")
public class WebController {

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }

    @RequestMapping("/goAdmin")
    public String goAdmin(){
        return "admin";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        System.out.println("login >>>> username:" + username + "---- password:" + password);
        session.setAttribute("loginUser",username);
        return "success";
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        //session过期
        session.invalidate();
        return "login";
    }

}
