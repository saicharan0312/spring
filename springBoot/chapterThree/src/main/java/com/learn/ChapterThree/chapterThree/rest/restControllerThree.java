package com.learn.ChapterThree.chapterThree.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restControllerThree {
    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }
    @GetMapping("/workout")
    public String getWork() {
        return "Work";
    }
    @GetMapping("/Fortune")
    public String getFortune() {
        return "Fortune";
    }
}
