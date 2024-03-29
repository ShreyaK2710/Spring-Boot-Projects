package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String home()
    {
        String str = "<html><body><font color=\"red\">"
                + "<h1>Learning Springboot</h1>"
                + "</font></body></html>";
        return str;
    }
    @RequestMapping(
            method={RequestMethod.GET},
            value={"/info"})

public String info() {
        String str2 = "<html><body><font color=\"green\">"
                + "<h2>Java Spring Boot is a tool that makes developing web application and microservices with Java Spring Framework faster and easier."
                + "</h2></font></body></html>";
        return str2;
    }
}
