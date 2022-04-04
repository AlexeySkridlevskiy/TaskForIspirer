package com.example.webtaskspring.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
