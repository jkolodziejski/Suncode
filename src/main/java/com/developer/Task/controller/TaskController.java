package com.developer.Task.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TaskController {

    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }

}
