package com.ashish.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
   @GetMapping("/helth-check")
   public String healthcheck()
    {
        return "ok";
    }
}
