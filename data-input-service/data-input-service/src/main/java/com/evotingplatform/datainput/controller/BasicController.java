package com.evotingplatform.datainput.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Value("${spring.application.name}")
    private String application;

    @GetMapping
    public String welcome(){
        return "Hello, " + "Welcome to "+application.toUpperCase().replace("-", " ")+" Micro-Services API.";
    }
}
