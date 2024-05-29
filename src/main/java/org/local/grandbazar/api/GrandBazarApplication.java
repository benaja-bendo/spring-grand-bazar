package org.local.grandbazar.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class GrandBazarApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrandBazarApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Welcome to Grand Bazar!";
    }
}
