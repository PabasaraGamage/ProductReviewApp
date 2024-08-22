package com.example.ProductReviewApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Product Review App! This is the version 3.0";
    }
}
