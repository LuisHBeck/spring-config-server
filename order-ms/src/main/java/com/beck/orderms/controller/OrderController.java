package com.beck.orderms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Value("${welcome.message}")
    private String message;

    @GetMapping
    public String getMessage() {
        return message;
    }

}
