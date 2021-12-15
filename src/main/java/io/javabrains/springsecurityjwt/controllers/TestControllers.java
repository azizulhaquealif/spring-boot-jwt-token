package io.javabrains.springsecurityjwt.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestControllers {

    @GetMapping("/test")
    public String test(){
        return "Fuck";
    }
}
