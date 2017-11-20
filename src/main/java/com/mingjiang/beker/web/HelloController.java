package com.mingjiang.beker.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/13.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) throws Exception{

        model.addAttribute("name", name);
        System.out.println("12312312");
//        throw new Exception("发生错误");
        return "/hello";
    }

    @RequestMapping("/hello")
    public String hello() throws Exception{
        throw new Exception("发生错误");
    }
}
