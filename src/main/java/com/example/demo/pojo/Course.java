package com.example.demo.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/15 0015 22:29
 */
@Data
@ToString
public class Course {
    private String name;
    private String room;
}

