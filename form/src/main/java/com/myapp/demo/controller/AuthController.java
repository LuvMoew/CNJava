package com.myapp.demo.controller;

import com.myapp.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String handleRegister(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("action", "Đăng ký");
        return "result";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("action", "Đăng nhập");
        return "result";
    }
}
