package com.chapterDemo.chapterOne.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello";
    }
}
