package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HellroController {
    @RequestMapping(value = "/hello")
    public String helloWorld(HttpServletRequest request, HttpServletResponse response) {
        return "hello world!!" + request.getQueryString();
    }
}
