package com.example.demo.controller;

import com.example.demo.model.WelcomeMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String showWelcomePage(Model model) {
        WelcomeMessage welcome = new WelcomeMessage("Chào mừng bạn đến với ứng dụng Spring Boot!", LocalDateTime.now());
        model.addAttribute("welcome", welcome);
        return "welcome"; // tên của file Thymeleaf (welcome.html)
    }
}
