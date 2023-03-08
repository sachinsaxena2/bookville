package com.rent.bookville.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderConfirmationController {

    @GetMapping("/hello123")
    public String helloWorld() {
        String best = "perfect";
        return best;
    }

    @GetMapping("/confirmOrder")
    public void saveOrder(@RequestParam String phoneNumber, @RequestParam String name) {
        log.info("PHONE NUMBER "+phoneNumber);
        log.info("Name "+name);
        String best = "perfect";
       // return best;
    }
}

