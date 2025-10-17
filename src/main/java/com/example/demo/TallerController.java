package com.taller.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TallerController {
    @GetMapping()
    public String home() {
        return "Spring Boot en EC2 con PostgreSQL funcionando correctamente";
    }
}
