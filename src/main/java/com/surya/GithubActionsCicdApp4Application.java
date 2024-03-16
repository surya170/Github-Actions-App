package com.surya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicdApp4Application {
    /*
    echo "# Github-Actions-App" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/surya170/Github-Actions-App.git
git push -u origin main
     */
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome To SpringBootApp";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsCicdApp4Application.class, args);
    }

}
