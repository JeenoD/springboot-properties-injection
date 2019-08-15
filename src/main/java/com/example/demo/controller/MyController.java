package com.example.demo.controller;

import com.example.demo.CourseConfig;
import com.example.demo.pojo.Course;
import com.example.demo.pojo.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/15 0015 22:01
 */
@RestController
@Slf4j
public class MyController {

    @Resource
    private User user;

    @Resource
    private CourseConfig config;

    @GetMapping("/obj")
    public User getObj(){
        return user;
    }

    @GetMapping("/list")
    public List<Course> getList(){
        return config.getCourse();
    }

    @GetMapping("/map")
    public Map<String, String> getMap(){
        return config.getProp();
    }
}
