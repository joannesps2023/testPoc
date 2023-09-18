package com.example.springapps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("test")
    public String test()
    {
        return "test";
    }
}
