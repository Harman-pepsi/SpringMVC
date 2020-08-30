package cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Classname WebController
 * @Description 跳转方式
 * @Date 2020/8/30 11:29
 * @Created by XJC·AW
 */
@Controller
public class WebController {

    @RequestMapping("/test/method1")
    public String testMethod1(Model model){
        model.addAttribute("msg","跳转方式一");
        return "admin";
    }

    @RequestMapping("/test/method2")
    public ModelAndView testMehotd2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","跳转方式二");
        modelAndView.setViewName("admin");
        return modelAndView;
    }
}
