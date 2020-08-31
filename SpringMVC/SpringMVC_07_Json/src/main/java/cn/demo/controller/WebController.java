package cn.demo.controller;

import cn.demo.domain.User;
import cn.demo.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Classname WebController
 * @Description TODO
 * @Date 2020/8/30 23:57
 * @Created by XJC·AW
 */
//@Controller
@RestController
public class WebController {

    @RequestMapping("/controller/testValue")
    //@ResponseBody //不会走视图解析器，直接返回一个字符串
    public String testValue(){
        User user = new User(1,"马化腾","12345678");
        return user.toString();
    }

    //@RequestMapping(value = "/controller/testJson",produces = "application/json;charset=utf-8") //手动配置乱码
    @RequestMapping(value = "/controller/testJson") //配置文件配置乱码问题
    //@ResponseBody
    public String testJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User(1,"马化腾","12345678");
        String s = objectMapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping(value = "/controller/testDate")
    public String testDate() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //不使用时间戳
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        Date date = new Date();
        //自定义日期格式
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //return objectMapper.writeValueAsString(simpleDateFormat.format(date));
        return objectMapper.writeValueAsString(date);
    }

    @RequestMapping(value = "/controller/testDate2")
    public String testDate2() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

}
