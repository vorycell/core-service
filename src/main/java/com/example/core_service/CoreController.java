package com.example.core_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    // Обработка GET-запроса на "/"
    @GetMapping("/")
    public String coreServiceHome() {
        return "Core Service is running!";
    }

    // Обработка GET-запроса на "/hello"
    @GetMapping("/hello")
    public String helloEndpoint() {
        return "Hello from Core Service!";
    }
}
