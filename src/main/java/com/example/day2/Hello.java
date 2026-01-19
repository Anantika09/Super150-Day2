package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class Hello {
    @GetMapping("S1")
    public String hello(){
        return "index";
    }
    @GetMapping("S2")
    public String about(){
        return "about";
    }
    @GetMapping("S3")
    public String contact(){
        return "contact";
    }
}
