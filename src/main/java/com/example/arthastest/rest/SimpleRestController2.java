package com.example.arthastest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController2 {

    @GetMapping("/arthas2")
    public String getSword() throws InterruptedException {
        return "2 files changes";
    }
}
