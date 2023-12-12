package com.mamonov.githubjavaciflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String hello() {
        return "DEFAULT PAGE";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello, my name is Dmitriy Mamonov";
    }
}
