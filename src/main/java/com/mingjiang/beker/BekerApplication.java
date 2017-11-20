package com.mingjiang.beker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BekerApplication {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet() {
        return "Login Page";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost() {
        return "Login Post Request";
    }
    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(BekerApplication.class, args);
    }
}
