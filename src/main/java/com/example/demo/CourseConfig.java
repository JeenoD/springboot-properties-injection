package com.example.demo;

import com.example.demo.pojo.Course;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/15 0015 22:49
 */
@Data
@Component
@PropertySource(value = "classpath:course.properties", encoding = "UTF-8")
@ConfigurationProperties(prefix = "system")
public class CourseConfig {

    private List<Course> course;

    private Map<String, String> prop;

}
