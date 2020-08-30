package cn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Classname WebController
 * @Description TODO
 * @Date 2020/8/30 2:01
 * @Created by XJC·AW
 */
@Controller
@RequestMapping("/controller")
public class WebController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","testRestful");
        return "admin";
    }

    @RequestMapping(value = "/testGet",method = RequestMethod.GET)
    public String testGet(int ia,int ib, Model model){
        model.addAttribute("msg",ia +"+"+ib+"的运行结果:" + (ia+ib));
        return "get";
    }

    @RequestMapping(value = "/testGet/{ia}/{ib}") //方法默认是GET
    public String testGet2(@PathVariable int ia, @PathVariable int ib, Model model){
        model.addAttribute("msg",ia +"+"+ib+"的运行结果:" + (ia+ib));
        return "get";
    }
}
