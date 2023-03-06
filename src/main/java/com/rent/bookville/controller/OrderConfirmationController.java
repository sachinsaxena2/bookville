package com.rent.bookville.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderConfirmationController {

    @GetMapping("/hello123")
    public String helloWorld() {
        String best = "perfect";
        return best;
    }
}

