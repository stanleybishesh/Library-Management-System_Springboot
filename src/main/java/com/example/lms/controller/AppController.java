package com.example.lms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AppController {
    @GetMapping("/dashboard")
    public String dashboard(){
        return "HTMLpages/dashboard";
    }
}
