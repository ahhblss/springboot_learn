package com.lss.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Sean on 2017/11/1.
 */
@Component
public class BlogProperties {
    @Value("${com.lss.blog.name}")
    private String name;
    @Value("${com.lss.blog.title}")
    private String title;

    @Value("${com.lss.blog.desc}")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
