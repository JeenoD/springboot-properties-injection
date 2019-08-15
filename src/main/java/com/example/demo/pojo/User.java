package com.example.demo.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/15 0015 22:04
 */
@Data
@Component
@ToString
@PropertySource(value = "classpath:user.properties", encoding = "UTF-8")
@ConfigurationProperties(prefix = "system.user")
public class User {

    private String name;
    private String email;
    private String phone;
    private String gender;
    private Integer age;
}
