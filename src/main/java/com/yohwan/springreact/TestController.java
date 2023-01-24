package com.yohwan.springreact;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @GetMapping
    public List<String> test() {
        return Arrays.asList("hello", "안녕");
    }
}
