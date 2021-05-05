package com.example.arthastest.rest;


import com.example.arthastest.service.SwordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    private final SwordService swordService;

    public SimpleRestController(SwordService swordService) {
        this.swordService = swordService;
    }

    @GetMapping("/arthas")
    public String getSword() throws InterruptedException {
        return swordService.getSword();
    }
}
