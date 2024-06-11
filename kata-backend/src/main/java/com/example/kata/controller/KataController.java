package com.example.kata.controller;

import com.example.kata.service.KataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kata")
public class KataController {

    @Autowired
    private KataService kataService;

    @GetMapping("/transform")
    public String transformNumber(@RequestParam int number) {
        return kataService.transformNumber(number);
    }
}