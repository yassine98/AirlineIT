package com.example.javaariline.controllers;

import org.springframework.web.bind.annotation.*;


@RestController

public class TestRestController {

    @GetMapping("/test")
    public String test() {
        return "Welcome to Java Airline!";
    }

}
