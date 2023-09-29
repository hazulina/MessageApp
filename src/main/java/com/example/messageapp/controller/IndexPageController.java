package com.example.messageapp.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexPageController {
    @GetMapping("/")
    public String showHelloPage(){
        return "enterForm";
    }

    @GetMapping("/setUsername")
    public String setUsername(@RequestParam("name") String name, HttpSession session) {
        session.setAttribute("username", name);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String showIndexPage(){
        return "index";
    }
}
