package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String greet() {

        return "Welcome to spring boot project";
    }

    @RequestMapping("/about")
    public String about() {
        return "<h1>About page of Spring Boot Project</h1>";
    }
}
