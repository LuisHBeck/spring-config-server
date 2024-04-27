package com.beck.paymentsms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RefreshScope
public class PaymentController {

    @Value("${welcome.message}")
    String message;

    @Value("${global.message}")
    String globalMessage;

    @GetMapping
    public String getMessage() {
        return message;
    }

    @GetMapping("/global")
    public String getGlobalMessage() {
        return globalMessage;
    }
}
