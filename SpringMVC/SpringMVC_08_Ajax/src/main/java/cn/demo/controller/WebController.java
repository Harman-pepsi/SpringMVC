package cn.demo.controller;

import cn.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname WebController
 * @Description TODO
 * @Date 2020/8/31 13:05
 * @Created by XJC·AW
 */
@Controller
public class WebController {

    @RequestMapping("/controller/test")
    public String test(Model model){
        model.addAttribute("msg","Test");
        return "admin";
    }

    @RequestMapping("/controller/testJson1")
    public void testJson1(String name, HttpServletResponse response) throws IOException {
        System.out.println("param>>>" + name);
        if("zhangsan".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/controller/testJson2")
    @ResponseBody
    public List<User> testJson2(){
        List<User> list = new ArrayList<User>();
        list.add(new User("秦疆1号",3,"男"));
        list.add(new User("秦疆2号",3,"男"));
        list.add(new User("秦疆3号",3,"男"));
        return list;
    }
}
