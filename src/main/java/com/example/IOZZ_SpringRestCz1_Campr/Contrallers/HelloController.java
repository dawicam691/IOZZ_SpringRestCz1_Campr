package com.example.IOZZ_SpringRestCz1_Campr.Contrallers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return LocalDateTime.now().toString();
    }
}
