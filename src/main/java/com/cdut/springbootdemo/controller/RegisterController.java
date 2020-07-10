package com.cdut.springbootdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RegisterController {
    @PostMapping("/api/register")
    public String register(){
        return "success";
    }
}
