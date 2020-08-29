package cn.demo.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname WebController
 * @Description TODO
 * @Date 2020/8/29 13:53
 * @Created by XJC·AW
 */
public class WebController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","SpringMVC测试!");
        modelAndView.setViewName("admin");
        return modelAndView;
    }
}
