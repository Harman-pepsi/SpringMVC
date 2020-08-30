package cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname WebController
 * @Description TODO
 * @Date 2020/8/30 12:20
 * @Created by XJC·AW
 */
@Controller
public class WebController {

    @RequestMapping("/controller/test")
    public String test(@RequestParam("username") String name, Model model){
        model.addAttribute("msg","name参数为:" + name);
        return "admin";
    }
}
