package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    // sign in page get
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }
}
