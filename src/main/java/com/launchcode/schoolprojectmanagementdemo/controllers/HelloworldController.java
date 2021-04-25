package com.launchcode.schoolprojectmanagementdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloworldController {
    @GetMapping
    public String helloWorld(){
        return "helloWorld";
    }
}
