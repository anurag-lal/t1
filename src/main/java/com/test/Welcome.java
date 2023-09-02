package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {

    @GetMapping("/welcome")
    @ResponseBody
    public String welcomeMessage() {
        return "Welcome to our Spring MVC application!";
    }
}

