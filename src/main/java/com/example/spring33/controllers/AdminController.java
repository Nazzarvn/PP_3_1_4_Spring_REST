package com.example.spring33.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/")
    public String admin() {
        return "mainPage";
    }

}
