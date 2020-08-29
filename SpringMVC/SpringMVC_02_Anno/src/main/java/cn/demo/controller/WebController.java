package cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname WebController
 * @Description TODO
 * @Date 2020/8/29 14:32
 * @Created by XJC·AW
 */
@Controller
@RequestMapping("/controller")
public class WebController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","测试!");
        return "admin";
    }
}
