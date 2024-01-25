package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // index page get method
    @GetMapping("/")
    public String index(){
        return "index"; //templates 폴더의 index를 찾아감
    }
}
