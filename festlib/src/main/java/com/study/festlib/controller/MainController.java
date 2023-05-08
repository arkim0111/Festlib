package com.study.festlib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/Festlib/")
    public String main() {
        return "main";
    }

}
