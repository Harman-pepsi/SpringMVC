package cn.demo.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @Classname JsonUtils
 * @Description TODO
 * @Date 2020/8/31 0:40
 * @Created by XJC·AW
 */
public class JsonUtils {

    public static String getJson(Object object,String dateFormat) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        objectMapper.setDateFormat(simpleDateFormat);
        return objectMapper.writeValueAsString(object);
    }
}
