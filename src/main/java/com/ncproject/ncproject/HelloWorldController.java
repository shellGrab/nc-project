package com.ncproject.ncproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld(){
        return "Hello World";
    }
}
