package com.example.arthastest.service;

import org.springframework.stereotype.Service;

@Service
class SimpleSwordService implements SwordService {


    @Override
    public String getSword() {
        return "Sword X - 1000 REST";
    }
}
