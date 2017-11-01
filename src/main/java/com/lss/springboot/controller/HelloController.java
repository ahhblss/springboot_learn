package com.lss.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sean on 2017/11/1.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody
    String hello() {
        return "helllo";
    }

    @RequestMapping("/host")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "hello";
    }

    @RequestMapping("/ex")
    public @ResponseBody
    String ex() throws Exception {
        throw new Exception("统一全局");
    }

}
