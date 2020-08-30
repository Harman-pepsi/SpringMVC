package cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Classname EncodController
 * @Description TODO
 * @Date 2020/8/30 17:02
 * @Created by XJC·AW
 */
@Controller
public class EncodController {

    @PostMapping("/controller/testEncoding")
    public String testEncoding(String name, Model model){
        model.addAttribute("msg","参数值为:" + name);
        return "admin";
    }
}
