package com.example.lms.controller;

import com.example.lms.model.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("/customLogin")
    public String loginPage(Model model){
        return "login";
    }

//    @PostMapping("/login")
//    public String login(@ModelAttribute LoginDTO login){
//
//    }
}
