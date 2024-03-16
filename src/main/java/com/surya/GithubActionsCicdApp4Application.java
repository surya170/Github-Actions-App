package com.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicdApp4Application {
   
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome To SpringBootApp";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsCicdApp4Application.class, args);
    }

}
